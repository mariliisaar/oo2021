package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    
    @GetMapping("/hello")
    public String showHello(@RequestParam(value = "who", defaultValue = "World") String who, Model model) {
        model.addAttribute("condition", true);
        model.addAttribute("who", who);
        return "hello";
    }
}
