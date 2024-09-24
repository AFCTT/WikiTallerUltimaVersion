package com.wiki.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Formulario {
    private Long id;
    private String nombres;
    private String apellidos;
    private String correo;
    private Integer semestre;
    private String descripcion;
}