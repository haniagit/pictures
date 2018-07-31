package com.example.obrazki.model;

import com.example.obrazki.dao.GifDao;

import java.util.ArrayList;
import java.util.List;

public class Gif implements GifDao {

    private Integer id;
    private String name;
    private static List<Gif> gifs = new ArrayList<>();




    public Gif(Integer id,String name) {
        this.id = id;
        this.name = name;
    }

    public Gif() {
    }

    public String getPath() {
        return "gifs/" + getName() + ".gif";
    }


    @Override
    public List<Gif> findAll() {
        gifs.add(new Gif(1, "android-explosion"));
        gifs.add(new Gif(2, "ben-and-mike"));
        gifs.add(new Gif(3, "book-dominos"));
        gifs.add(new Gif(4, "compiler-bot"));
        gifs.add(new Gif(5, "cowboy-coder"));
        gifs.add(new Gif(6, "infinite-andrew"));
        return gifs;
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


}
