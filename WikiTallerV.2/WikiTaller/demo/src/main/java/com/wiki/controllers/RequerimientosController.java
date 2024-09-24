package com.wiki.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/requerimientos")
public class RequerimientosController {
    
    // http://localhost:8080/requerimientos/view
    @GetMapping("/view")
    public ModelAndView mostrarRequerimientos(){
        ModelAndView model = new ModelAndView("requerimientos");
        return model;
    }
}
