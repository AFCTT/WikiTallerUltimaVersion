package com.wiki.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/descripcion")
public class DescripcionController {
    
    // http:localhost:8080/descripcion/view
    @GetMapping("/view")
    public ModelAndView mostrarDescripcion(){
        ModelAndView model = new ModelAndView("descripcion");
        return model;
    }
}
