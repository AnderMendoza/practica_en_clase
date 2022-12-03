package com.example.practica_en_clase.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/inicio")
public class IndexController {
    
    @Value("${title.index)")
    private String TitlePage;

    @GetMapping({"/inicio", "/", "inicio"})
    public String ControllerIndex(Model model) {
        return "index";
    }

}
