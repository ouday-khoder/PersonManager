package com.Ouday.springboot.thymeleafdemotest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String redirectToPersonList() {
        return "redirect:/persons/list";
    }
}