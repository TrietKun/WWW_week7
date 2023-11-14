package com.example.demo.frontend.Controllers;

import com.example.demo.backend.models.Product;
import com.example.demo.backend.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

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
    @GetMapping("/delete/{id}")
    public RedirectView deleteProduct(@PathVariable Long id) {
        productService.deleteById(id);
        return new RedirectView("/home", true);    }

    @PostMapping("/save/{id}")
    public RedirectView saveProduct(@PathVariable Long id, @RequestBody Product updatedProduct) {
        Product product = productService.findById(id);
        product.setName(updatedProduct.getName());
        product.setDescription(updatedProduct.getDescription());
        product.setUnit(updatedProduct.getUnit());
        product.setManufacturer(updatedProduct.getManufacturer());
        product.setStatus(updatedProduct.getStatus());
        productService.save(product);
        return new RedirectView("/home", true);    }

    @PostMapping("/add")
    public RedirectView addProduct(@RequestBody Product product) {
        productService.save(product);
        return new RedirectView("/home", true);    }
}
