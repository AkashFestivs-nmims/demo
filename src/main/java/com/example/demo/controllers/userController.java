package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class userController {
    
    @GetMapping("/login")
    public String login(){
        System.out.println("login Page Called");
        return "login";
    }
}
