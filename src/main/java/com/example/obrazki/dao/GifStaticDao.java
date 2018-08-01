package com.example.obrazki.dao;

import com.example.obrazki.dao.GifDao;
import com.example.obrazki.model.Category;
import com.example.obrazki.model.Gif;

import java.util.ArrayList;
import java.util.List;

public class GifStaticDao implements GifDao {
    private static List<Gif> gifs = new ArrayList<>();
    private static List<Category> categories = new ArrayList<>();

    static {
        Category android = new Category(1, "Android");
        Category funny = new Category(2, "Funny");
        Category programming = new Category(3, "Programming");
        categories.add(android);
        categories.add(funny);
        categories.add(programming);

        gifs.add(new Gif(1, "android-explosion", false, android));
        gifs.add(new Gif(2, "ben-and-mike", true, funny));
        gifs.add(new Gif(3, "book-dominos", false, programming));
        gifs.add(new Gif(4, "compiler-bot", true, android));
        gifs.add(new Gif(5, "cowboy-coder", false, programming));
        gifs.add(new Gif(6, "infinite-andrew", true, funny));
    }


    @Override
    public List<Gif> findAll() {
        return gifs;
    }

    @Override
    public List<Gif> favorites() {
        List<Gif> favGifs = new ArrayList<>();

        for (int i = 0; i < gifs.size(); i++) {
            if (gifs.get(i).isFavorite()) {
                favGifs.add(gifs.get(i));
            }
        }
        return favGifs;
    }

    @Override
    public List<Gif> searchGif(String gifName) {
        List<Gif> neededGifs = new ArrayList<>();
        for(Gif gif: gifs){
            if(gif.getName().contains(gifName)){
                neededGifs.add(gif);
            }
        }
        return neededGifs;
    }

    @Override
    public List<Category> findAllCat() {
        return categories;
    }
}
