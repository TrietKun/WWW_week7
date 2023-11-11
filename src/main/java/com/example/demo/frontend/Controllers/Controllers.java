package com.example.demo.frontend.Controllers;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controllers {
    @GetMapping("/home")
    public String myPage(){
        return "admin/product/list-product";
    }
}
