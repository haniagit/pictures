package com.example.obrazki.Dao;

import com.example.obrazki.model.Gif;
import java.util.List;

public interface GifDao {

    public List<Gif> findAll();

    public List<Gif> favorites();


}
