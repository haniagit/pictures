package com.example.obrazki.controller;


import com.example.obrazki.Dao.GifDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PicturesController {

    private GifDao gifDao;

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/home")
    public String findAll(ModelMap modelMap){
        modelMap.put("gifs", gifDao.findAll());
        return "home";
    }
}
