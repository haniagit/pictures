package com.example.obrazki.controller;



import com.example.obrazki.dao.CategoryStaticDao;
import com.example.obrazki.dao.GifStaticDao;
import com.example.obrazki.model.Category;
import com.example.obrazki.model.Gif;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api")
public class ApiController {


    @GetMapping("/gifs")
    public Iterable<Gif> all(){
        GifStaticDao gifStaticDao = new GifStaticDao();
        return gifStaticDao.findAll();
    }

    @GetMapping("/categories")
    public Iterable<Category> allCategories(){
        CategoryStaticDao categoryStaticDao = new CategoryStaticDao();
        return categoryStaticDao.findAll();
    }

    @GetMapping("category/{id}")
    public Category show(@PathVariable Integer id){
        CategoryStaticDao categoryStaticDao = new CategoryStaticDao();
        return categoryStaticDao.findAll().stream().filter(p->p.getId()==id).findFirst().get();
    }
    // gif?id=
    @GetMapping("gif")
    public String showGif(@RequestParam Integer id){
        GifStaticDao gifStaticDao = new GifStaticDao();
        gifStaticDao.toggleGif(id);
        return "ok";
    }
}
