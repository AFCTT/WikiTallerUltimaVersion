package com.wiki.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/arquitectura")
public class ArquitecturaController {
    
    // http://localhost:8080/arquitectura/view
    @GetMapping("/view")
    public ModelAndView mostrarArquitectura(){
        ModelAndView model = new ModelAndView("arquitectura");
        return model;
    }
}
