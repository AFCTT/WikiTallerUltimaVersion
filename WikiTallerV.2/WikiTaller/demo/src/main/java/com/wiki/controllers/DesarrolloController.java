package com.wiki.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/desarrollo")
public class DesarrolloController {
    
    // http://localhost:8080/desarrollo/view
    @GetMapping("/view")
    public ModelAndView mostrarDesarrollo(){
        ModelAndView model = new ModelAndView("desarrollo");
        return model;
    }
}
