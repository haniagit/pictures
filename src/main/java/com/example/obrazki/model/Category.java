package com.example.obrazki.model;

import java.util.ArrayList;
import java.util.List;

public class Category {

    private Integer id;
    private String name;
    private static List<Category> categories = new ArrayList<>();





    public Category(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static List<Category> getCategories() {
        return categories;
    }

    public static void setCategories(List<Category> categories) {
        Category.categories = categories;
    }


}
