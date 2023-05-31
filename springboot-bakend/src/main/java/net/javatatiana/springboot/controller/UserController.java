package net.javatatiana.springboot.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javatatiana.springboot.model.User;
import net.javatatiana.springboot.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;


@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("api/")  // mapea  la peticion  http

public class UserController {

	 //inyectar el repositorio
	@Autowired
	private UserRepository userRepository;
	
	
	// crear un metodo de lista que devuelve   el repositorio de usuarios
	
	 @GetMapping("users")  //  peticion get
	  public List<User> getUsers (){
		  
		  return this.userRepository.findAll();
	  }
}
