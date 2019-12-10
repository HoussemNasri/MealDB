package com.company.Models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MealList {
    @SerializedName("meals")
    public List<Meal> mealList;
}
