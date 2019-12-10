package com.company.Clients;

import com.company.Models.Category;
import com.company.Models.CategoryList;
import com.company.Services.CategoryService;
import com.company.Utils.Constants;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;

public class CategoryClient extends Client {

    private static List <Category> allCategories;

    @Override
     String getBaseUrl() {
        return Constants.CATEGORY_SERVICE_BASE_URL;
    }

    public static String getStaticBaseUrl () {
        return new CategoryClient().getBaseUrl();
    }

    public static void loadCategories () throws IOException {
        System.out.println("Loading Categories ...");
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(getStaticBaseUrl())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        CategoryService categoryService = retrofit.create(CategoryService.class);
        Call<CategoryList> call = categoryService.getAllCategories();
        allCategories = call.execute().body().categoryList;
        System.out.println("Categories Loaded Successfully");

    }

    public static Category getCategoryAt (int index) {
        if (index > Count() - 1 ) {
            throw new ArrayIndexOutOfBoundsException("Category Index Not Found !!");
        }
        return allCategories.get(index);
    }

    public static int Count (){
        return allCategories.size();
    }

}
