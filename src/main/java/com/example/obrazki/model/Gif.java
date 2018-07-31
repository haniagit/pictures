package com.example.obrazki.model;

import com.example.obrazki.Dao.GifDao;
import sun.plugin.javascript.navig.LinkArray;

import java.util.ArrayList;
import java.util.List;

public class Gif implements GifDao {

    private Integer id;
    private String name;
    private static List<Gif> gifs = new ArrayList<>();
    private  boolean isFavorite;

    public boolean isFavorite() {
        return isFavorite;
    }


    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

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


    @Override
    public List<Gif> findAll() {
        gifs.add(new Gif(1, "android-explosion", true));
        gifs.add(new Gif(2, "ben-and-mike", false));
        gifs.add(new Gif(3, "book-dominos", true));
        gifs.add(new Gif(4, "compiler-bot", true));
        gifs.add(new Gif(5, "cowboy-coder", false));
        gifs.add(new Gif(6, "infinite-andrew", true));
        return gifs;
    }

    @Override
    public List<Gif> favorites() {
        List<Gif> favGifs = new ArrayList<>();

        for (int i = 0; i < gifs.size(); i++) {
            if (gifs.get(i).isFavorite) {
                favGifs.add(gifs.get(i));
            }
        }

        return favGifs;
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