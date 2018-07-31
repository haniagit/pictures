package com.example.obrazki.controller;


import com.example.obrazki.dao.GifDao;
import com.example.obrazki.model.GifStaticDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PicturesController {

    private GifDao gifDao = new GifStaticDao();

    @GetMapping("/")
    public String home(ModelMap modelMap){
        modelMap.put("gifs", gifDao.findAll());
        return "home";
    }

    @GetMapping("/favorites")
    public String showFav(ModelMap modelMap){
        modelMap.put("fav", gifDao.favorites());
        return"favorites";
    }
}
