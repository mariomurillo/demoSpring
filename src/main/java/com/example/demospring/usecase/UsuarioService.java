package com.example.demospring.usecase;

import com.example.demospring.model.Persona;
import com.example.demospring.repos.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

  private final UserRepository repository;

  public UsuarioService(UserRepository repository) {
    this.repository = repository;
  }

  public void guardar(Persona usuario) {
    repository.save(usuario);
  }
}