package com.example.obrazki.dao;

import com.example.obrazki.model.Category;
import com.example.obrazki.model.Gif;

import java.util.List;

public interface GifDao {

    public List<Gif> findAll();

    public List<Gif> favorites ();

    public List<Gif> searchGif(String gifName);

    public Gif findById(int id);

    public List<Gif> categoryGifs(int i);

    public void toggleGif(int id);

}

