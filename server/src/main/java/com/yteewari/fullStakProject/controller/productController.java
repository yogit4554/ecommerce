package com.yteewari.fullStakProject.controller;

import com.yteewari.fullStakProject.model.Product;
import com.yteewari.fullStakProject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class productController {
    @Autowired
    private ProductService productService;


    @RequestMapping("/")
    public String home() {
        return "Product Page!";
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

}
