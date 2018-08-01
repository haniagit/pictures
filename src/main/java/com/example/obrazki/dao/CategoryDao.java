package com.example.obrazki.dao;

import com.example.obrazki.model.Category;

import java.util.List;

public interface CategoryDao {

    public List<Category> findAll();

    public Category findCatById(int id);
}
