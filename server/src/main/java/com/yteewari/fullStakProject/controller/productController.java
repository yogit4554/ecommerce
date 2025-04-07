package com.yteewari.fullStakProject.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class productController {

    @RequestMapping("/")
    public String home() {
        return "Product Page!";
    }
}
