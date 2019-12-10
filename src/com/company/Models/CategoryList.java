package com.company.Models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CategoryList {
    @SerializedName("categories")
    public List<Category> categoryList;
}
