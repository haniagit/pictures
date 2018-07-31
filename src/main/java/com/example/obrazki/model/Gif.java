package com.example.obrazki.model;

import com.example.obrazki.dao.GifDao;

import java.util.ArrayList;
import java.util.List;

public class Gif implements GifDao {

    private static int id;
    private String name;
    private List<Gif> gifs = new ArrayList<>();

    public Gif(String name) {
        this.id = id;
        this.name = name;
        gifs.add(this);
    }

    @Override
    public List<Gif> findAll() {
        gifs.add(new Gif( "static/gifs/android-explosion.gif"));
        return gifs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Gif> getGifs() {
        return gifs;
    }

    public void setGifs(List<Gif> gifs) {
        this.gifs = gifs;
    }


}
