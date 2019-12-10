package com.company.Services;

import com.company.Models.MealList;
import com.company.Utils.Constants;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SearchService {

    @GET(Constants.SEARCH_SERVICE_BASE_URL)
    Call<MealList> getMealsByFirstLetter (@Query("f") char firstLetter);

    @GET(Constants.SEARCH_SERVICE_BASE_URL)
    Call<MealList> getMealByName (@Query("s") String name);

}
