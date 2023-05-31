package net.javatatiana.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javatatiana.springboot.model.User;
import net.javatatiana.springboot.repository.UserRepository;

@SpringBootApplication
public class SpringbootBakendApplication implements CommandLineRunner {  // interfaz para cargar o ejecutar el código después de que se haya iniciado

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBakendApplication.class, args);
	}
	
	// inyectamos
	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public void run(String...args) throws Exception{
		this.userRepository.save(new User("Tatiana", "Gomez", "tatianatsslow@gmail.com"));
		this.userRepository.save(new User("Diana", "Martinez", "diana12@gmail.com"));
		this.userRepository.save(new User("Juan", "Mendes", "juan34@gmail.com"));
	}
	}


