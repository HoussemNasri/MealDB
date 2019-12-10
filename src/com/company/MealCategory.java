package com.company;

import java.util.ArrayList;

public enum MealCategory {

    BEEF("Beef"),
    BREAKFAST("Breakfast"),
    CHICKEN("Chicken"),
    DESSERT("Dessert"),
    GOAT("Goat"),
    LAMB("Lamb"),
    MISCELLANEOUS("Miscellaneous"),
    PASTA("Pasta"),
    PORK("Pork"),
    SEAFOOD("Seafood"),
    SIDE("Side"),
    STARTER("Starter"),
    VEGAN("Vegan"),
    VEGETARIAN("Vegetarian");

    private String strCategory;

    MealCategory(String strCategory) {
        this.strCategory = strCategory;

    }

    public String getStrCategory () {
        new ArrayList<MealCategory> ().add(MealCategory.PASTA);
        return this.strCategory;
    }

}
