package com.example.obrazki.dao;

import com.example.obrazki.model.Gif;

import java.util.List;

public interface GifDao {

    public List<Gif> findAll();

    public List<Gif> favorites ();

    public List<Gif> searchGif(String gifName);


}

