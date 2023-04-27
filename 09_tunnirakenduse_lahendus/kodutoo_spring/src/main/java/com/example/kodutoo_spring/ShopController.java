package com.example.kodutoo_spring;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ShopController {
    private final WineController wineController;

    private final BeerController beerController;

    public ShopController(BeerController beerController, WineController wineController) {
        this.beerController = beerController;
        this.wineController = wineController;
    }

    @GetMapping("/wines")
    public List<Wine> getWines() {
        return wineController.getWines();
    }

    @GetMapping("/beers")
    public List<Beer> getBeers() {
        return beerController.getBeers();
    }

    @GetMapping("/all")
    public List<Object> getAllDrinks() {
        List<Object> drinks = new ArrayList<>();
        drinks.addAll(wineController.getWines());
        drinks.addAll(beerController.getBeers());
        return drinks;
    }
}
