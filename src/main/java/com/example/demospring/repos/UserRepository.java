package com.example.demospring.repos;

import com.example.demospring.model.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Persona, Integer> {

}
