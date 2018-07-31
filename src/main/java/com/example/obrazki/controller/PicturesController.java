package com.example.obrazki.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PicturesController {

    @GetMapping("/")
    public String home(){
        return "home";
    }
}
