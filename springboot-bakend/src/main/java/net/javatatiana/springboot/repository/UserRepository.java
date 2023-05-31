package net.javatatiana.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javatatiana.springboot.model.User;

//User es la clase y long el tipo  de datos de la clave primaria

public interface UserRepository extends JpaRepository<User, Long>{ 

}
