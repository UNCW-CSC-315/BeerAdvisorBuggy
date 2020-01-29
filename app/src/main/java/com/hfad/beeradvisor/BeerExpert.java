package com.hfad.beeradvisor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BeerExpert {

    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();
        switch(color) {
            case "amber":
                brands.add("Jack Amber");
                brands.add("Red Moose");
            case "light":
                brands.add("Bud Light");
                brands.add("Salty IPA");
            case "dark":
                brands.add("Gout Stout");
            default:
                brands.add("Newcastle");
        }

        return brands;
    }
}
