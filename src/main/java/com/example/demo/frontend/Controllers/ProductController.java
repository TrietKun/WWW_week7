package com.example.demo.frontend.Controllers;

import com.example.demo.backend.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

}
