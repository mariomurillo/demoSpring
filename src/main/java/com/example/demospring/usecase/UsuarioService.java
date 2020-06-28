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
/*
com.mysql.jdbc.Driver
jdbc:mysql://localhost:3306/mysqltutorial?useSSL=false

spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:3306/db_example
spring.datasource.username=springuser
spring.datasource.password=ThePassword

spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5Dialect
 */