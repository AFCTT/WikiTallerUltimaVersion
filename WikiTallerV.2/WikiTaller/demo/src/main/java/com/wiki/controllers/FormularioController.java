package com.wiki.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wiki.models.Formulario;

@Controller
@RequestMapping("/formulario")
public class FormularioController {
    
    // http://localhost:8080/formulario/view
      @GetMapping("/view")
    public ModelAndView mostrarFormulario() {
        ModelAndView model = new ModelAndView("formulario");
        model.addObject("formulario", new Formulario());
        return model;
    }

    @PostMapping("/submit")
    public ModelAndView procesarFormulario(@ModelAttribute Formulario formulario) {
        // Aquí podrías procesar los datos, por ahora solo mostramos los datos en la vista "resultado"
        ModelAndView model = new ModelAndView("resultado");
        model.addObject("formulario", formulario);
        return model;
    }
}
