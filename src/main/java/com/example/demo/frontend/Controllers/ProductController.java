package com.example.demo.frontend.Controllers;

import com.example.demo.backend.models.Product;
import com.example.demo.backend.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping("/products")
    @ResponseBody
    public List<Product> findAllProducts(){
        return productService.findAll();
    }

}
