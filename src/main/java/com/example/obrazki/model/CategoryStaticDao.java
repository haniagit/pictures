package com.example.obrazki.model;

import com.example.obrazki.dao.CategoryDao;

import java.util.ArrayList;
import java.util.List;

public class CategoryStaticDao  implements CategoryDao {

    private static List<Category> categories = new ArrayList<>();

    static {
        categories.add(new Category(1, "Android"));
        categories.add(new Category(2, "Funny"));
        categories.add(new Category(3, "Programming"));

    }


    @Override
    public List<Category> findAll() {
        return categories;

    }
}
