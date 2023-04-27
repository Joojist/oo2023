package com.example.kodutoo_spring;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class BeerController {
    List<Beer> beers = new ArrayList<>(Arrays.asList(
            new Beer(1, "Heineken", "Lager", "Pale", 2020, 5.0, 0.5, true),
            new Beer(2, "Guinness", "Stout", "Dark", 2019, 4.2, 0.5, false),
            new Beer(3, "Leffe", "Belgian Ale", "Amber", 2021, 6.6, 0.33, true),
            new Beer(4, "Budweiser", "Pilsner", "Pale", 2018, 4.8, 0.5, false),
            new Beer(5, "Corona", "Lager", "Pale", 2020, 4.5, 0.33, true),
            new Beer(6, "Chimay", "Trappist Ale", "Dark", 2017, 8.0, 0.33, true),
            new Beer(7, "Kilkenny", "Irish Red Ale", "Red", 2019, 4.3, 0.5, true),
            new Beer(8, "Erdinger", "Weissbier", "Light", 2022, 5.6, 0.5, true),
            new Beer(9, "Hoegaarden", "Witbier", "Light", 2018, 4.9, 0.5, false),
            new Beer(10, "Pilsner Urquell", "Pilsner", "Pale", 2021, 4.4, 0.5, true)
    ));

    @GetMapping("/beers1")
    public List<Beer> getBeers() {
        return beers;
    }

    @GetMapping("/beer/{id}")
    public Beer getBeerById(@PathVariable int id) {
        return beers.stream()
                .filter(b -> b.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @GetMapping("/addbeer/{name}/{type}/{style}/{year}/{amount}/{alcoholContent}/{active}")
    public List<Beer> addbeer(
            @PathVariable String name,
            @PathVariable String type,
            @PathVariable String style,
            @PathVariable int year,
            @PathVariable double amount,
            @PathVariable double alcoholContent,
            @PathVariable boolean active) {
        int nextId = beers.stream()
                .mapToInt(Beer::getId)
                .max()
                .orElse(0) + 1;
        beers.add(new Beer(nextId, name, type,  style, year, amount, alcoholContent, active));
        return beers;
    }

    @DeleteMapping("/deletebeer/{id}")
    public List<Beer> deleteBeer(@PathVariable int id) {
        beers.removeIf(b -> b.getId() == id);
        return beers;
    }
}