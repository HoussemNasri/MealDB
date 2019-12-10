package com.company;

import com.company.Clients.SearchClient;
import com.company.Exceptions.CannotFindMealException;
import com.company.Models.Meal;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        SearchClient searchClient = new SearchClient();
        try {
            List<Meal> meals = SearchClient.loadMealsByFirstLetter('b');
            for (Meal meal:meals) System.out.println(" - " + meal.getStrMeal());
        } catch (CannotFindMealException e) {
            System.out.println(e.getMessage());
        }
    }
}
