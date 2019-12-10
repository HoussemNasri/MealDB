package com.company.Clients;

import com.company.Exceptions.CannotFindMealException;
import com.company.Models.Meal;
import com.company.Models.MealList;
import com.company.Services.SearchService;
import com.company.Utils.Constants;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;

public class SearchClient extends Client {
    @Override
    String getBaseUrl() {
        return Constants.SEARCH_SERVICE_BASE_URL;
    }

    public static String getStaticBaseUrl () {
        return new SearchClient().getBaseUrl();
    }

    public static Meal loadMealByName (String name) throws CannotFindMealException {
        System.out.println("Searching For Your Meal...");
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(getStaticBaseUrl())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        SearchService searchService = retrofit.create(SearchService.class);
        Call<MealList> searchByNameCall = searchService.getMealByName(name);
        List<Meal> mealList = null;

        try { mealList = searchByNameCall.execute().body().mealList; }
        catch (IOException e) { e.printStackTrace(); }

        if (mealList != null) {
            System.out.println("Meal founded successfully");
            return mealList.get(0);
        }
        else
            throw new CannotFindMealException();

    }

    public static List<Meal> loadMealsByFirstLetter (char firstLetter) throws CannotFindMealException {
        System.out.println("Searching For All Meals Starting With "+firstLetter+"...");
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(getStaticBaseUrl())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        SearchService searchService = retrofit.create(SearchService.class);
        Call<MealList> mealListCall = searchService.getMealsByFirstLetter(firstLetter);
        List<Meal> mealList = null;

        try { mealList = mealListCall.execute().body().mealList; }
        catch (IOException e) { e.printStackTrace(); }

        if (mealList != null) {
            System.out.println("Meals founded successfully");
            return mealList;
        }
        else
            throw new CannotFindMealException();

    }
}
