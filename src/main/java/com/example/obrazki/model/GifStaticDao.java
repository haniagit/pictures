package com.example.obrazki.model;

import com.example.obrazki.dao.GifDao;

import java.util.ArrayList;
import java.util.List;

public class GifStaticDao implements GifDao {
    private static List<Gif> gifs = new ArrayList<>();

    static {
        gifs.add(new Gif(1, "android-explosion", false));
        gifs.add(new Gif(2, "ben-and-mike", true));
        gifs.add(new Gif(3, "book-dominos", false));
        gifs.add(new Gif(4, "compiler-bot", true));
        gifs.add(new Gif(5, "cowboy-coder", false));
        gifs.add(new Gif(6, "infinite-andrew", true));
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
}
