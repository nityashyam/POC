package com.firstservice.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class ProductController {

    @GetMapping("/message")
    public String test() {
        return "Hello JavaInUse Called in First Service";
    }
}