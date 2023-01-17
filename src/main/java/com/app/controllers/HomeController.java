package com.app.controllers;

import org.springframework.web.bind.annotation.GetMapping;


public class HomeController {
    @GetMapping("/home")
    public String home() {
        return "Home!";
    }
}
