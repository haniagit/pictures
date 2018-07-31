package com.example.obrazki.model;

import java.util.ArrayList;
import java.util.List;

public class Gif {

    private Integer id;
    private String name;
    private static List<Gif> gifs = new ArrayList<>();
    private  boolean isFavorite;



    public Gif(Integer id, String name, boolean isFavorite) {
        this.id = id;
        this.name = name;
        this.isFavorite = isFavorite;
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

    public List<Gif> getGifs() {
        return gifs;
    }

    public void setGifs(List<Gif> gifs) {
        this.gifs = gifs;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

}