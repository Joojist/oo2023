package com.example.kodutoo_spring;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class WineController {
    List<Wine> wines = new ArrayList<>(Arrays.asList(
            new Wine(1, "Merlot", "Red", 2015, 13.5, 10, true),
            new Wine(2, "Chardonnay", "White", 2018, 12.0, 15, true),
            new Wine(3, "Cabernet Sauvignon", "Red", 2017, 14.0, 8, false),
            new Wine(4, "Pinot Grigio", "White", 2020, 11.5, 20, true),
            new Wine(5, "Shiraz", "Red", 2016, 14.5, 12, true),
            new Wine(6, "Sauvignon Blanc", "White", 2019, 12.5, 18, true),
            new Wine(7, "Malbec", "Red", 2014, 13.0, 9, true),
            new Wine(8, "Riesling", "White", 2021, 11.0, 25, true),
            new Wine(9, "Zinfandel", "Red", 2018, 15.0, 7, true),
            new Wine(10, "Gewurztraminer", "White", 2017, 12.5, 14, true)
    ));
    @GetMapping("wine")
    public List<Wine> saaTooted() {
        return wines;
    }
    @GetMapping("/wines1")
    public List<Wine> getWines() {
        return wines;
    }

    @GetMapping("/idwines/{id}")
    public Wine getWineById(@PathVariable int id) {
        for (Wine wine : wines) {
            if (wine.getId() == id) {
                return wine;
            }
        }
        return null; // or throw an exception
    }

    @GetMapping("/addwine/{name}/{grapetype}/{year}/{amount}/{alcoholamount}/{active}")
    public List<Wine> addwine(
            @PathVariable String name,
            @PathVariable String grapetype,
            @PathVariable int year,
            @PathVariable int amount,
            @PathVariable double alcoholamount,
            @PathVariable boolean active) {
        int nextId = wines.stream()
                .mapToInt(Wine::getId)
                .max()
                .orElse(0) + 1;
        wines.add(new Wine(nextId, name, grapetype, amount, alcoholamount, year, active));
        return wines;
    }

    @DeleteMapping("/deletewine/{id}")
    public List<Wine> deleteWine(@PathVariable int id) {
        for (Wine wine : wines) {
            if (wine.getId() == id) {
                wines.remove(wine);
                break;
            }
        }
        return wines;
    }
}
