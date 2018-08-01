package com.example.obrazki.model;

import java.util.ArrayList;
import java.util.List;

public class Gif {

    private Integer id;
    private String name;
    private  boolean isFavorite;
    private Category category;
    private String userName;


    public Gif(Integer id, String name, boolean isFavorite, Category category, String userName) {
        this.id = id;
        this.name = name;
        this.isFavorite = isFavorite;
        this.category = category;
        this.userName = userName;
    }

    public Gif() {
    }

    public String getPath() {
        return "gifs/" + getName() + ".gif";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}