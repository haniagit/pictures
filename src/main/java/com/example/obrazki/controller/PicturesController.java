package com.example.obrazki.controller;


import com.example.obrazki.dao.GifDao;
import com.example.obrazki.dao.GifStaticDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


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

    @GetMapping("/show")
    public String search(ModelMap modelMap, String q){
        modelMap.put("gifs", gifDao.searchGif(q));
        if (gifDao.searchGif(q).size() == 0){
            modelMap.put("message", "Nic nie znaleziono");
        }
        return "home";
    }

    @GetMapping("/categories")
    public String showCategories(ModelMap modelMap){
        modelMap.put("categories", gifDao.findAllCat());
        return "categories";
    }

    @GetMapping("/category/{id}")
    public String getGifsByCategory(@PathVariable Integer id, ModelMap modelMap){
        modelMap.put("gifs", gifDao.findById(id));
        modelMap.put("category", gifDao.findCatById(id));
        return "category";
    }

}
