package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProduitController {
    @RequestMapping("/")
    public String home(){
        return "This is Home page";
    }
    @RequestMapping("/arjuncodes")
    public String arjuncodes(){
        return "This is my page";
    }
}
