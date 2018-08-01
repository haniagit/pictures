package com.example.obrazki.dao;

import com.example.obrazki.model.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryStaticDao implements CategoryDao{

    private static List<Category> categories = new ArrayList<>();

    static {
        categories.add(new Category( 1, "Android"));
        categories.add(new Category(2, "Funny"));
        categories.add(new Category(3, "Programming"));
    }

    @Override
    public List<Category> findAll() {
        return categories;
    }

    @Override
    public Category findCatById(int id) {
        for(Category category : categories){
            if(category.getId() == id){
                return category;
            }
        }
        return null;
    }
}
