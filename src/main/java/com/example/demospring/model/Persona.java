package com.example.demospring.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persona {

  @Id
  private Integer id;
  private String name;
  private String lastname;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
