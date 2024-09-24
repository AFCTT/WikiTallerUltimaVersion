package com.wiki.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/presentacion")
public class PresentacionController {
    
    // http://localhost:8080/presentacion/view
    @GetMapping("/view")
    public ModelAndView mostrarPresentacion(){
        ModelAndView model = new ModelAndView("presentacion");
        return model;
    }
}
