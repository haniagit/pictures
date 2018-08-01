package com.example.obrazki.controller;



import com.example.obrazki.dao.GifStaticDao;
import com.example.obrazki.model.Gif;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api")
public class ApiController {


    @GetMapping("/gifs")
    public Iterable<Gif> all(){
        GifStaticDao gifStaticDao = new GifStaticDao();
        return gifStaticDao.findAll();
    }
}
