package com.company.Services;

import com.company.Models.CategoryList;
import com.company.Utils.Constants;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;


public interface CategoryService {
    @GET(Constants.CATEGORY_SERVICE_BASE_URL)
    Call<CategoryList> getAllCategories ();
}
