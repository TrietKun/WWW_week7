package com.example.demo.frontend.Controllers;

import com.example.demo.backend.models.Order;
import com.example.demo.backend.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    @GetMapping("/orders")
    public List<Order> findAllOrders(){
        return orderService.findAll();
    }
}
