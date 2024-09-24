package com.wiki.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/index")
public class IndexController {
    
    // http://localhost:8080/index/view
    @GetMapping("/view")
    public ModelAndView mostrarIndex(){
        ModelAndView model = new ModelAndView("index");
        return model;
    }
}
