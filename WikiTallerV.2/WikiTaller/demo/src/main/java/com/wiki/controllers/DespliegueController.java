package com.wiki.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/despliegue")
public class DespliegueController {
    
    // http://localhost:8080/despliegue/view
    @GetMapping("/view")
    public ModelAndView mostrarDespliegue(){
        ModelAndView model = new ModelAndView("despliegue");
        return model;
    }
}
