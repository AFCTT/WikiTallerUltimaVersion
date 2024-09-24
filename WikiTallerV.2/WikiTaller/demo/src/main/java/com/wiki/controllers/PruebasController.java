package com.wiki.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/pruebas")
public class PruebasController {
    
    // http://localhost:8080/pruebas/view
    @GetMapping("/view")
    public ModelAndView mostrarPruebas(){
        ModelAndView model = new ModelAndView("pruebas");
        return model;
    }
}
