package com.example.demospring.controllers;

import com.example.demospring.model.Persona;
import com.example.demospring.usecase.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

  @Autowired
  private UsuarioService servicio;

  @GetMapping("/saludar")
  public String saludar() {
    return "Hola Mundo";
  }

  @GetMapping("/saludar/{nombre}")
  public String saludar(@PathVariable String nombre) {

    Persona usuario = new Persona();
    usuario.setId(1);
    usuario.setName(nombre);

    servicio.guardar(usuario);

    return "Hola " + nombre;
  }
}
