package com.driver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
//add new records -->
//add a movie you really want to watch
//add a new director you discovered and want to explore his work
//add a movie-director pair.
//
//Movie and Director as your only model classes,
//which will have some fields as their properties, constructors and getters-setters.
//
//controller, service and repository class with appropriate annotations.


//	Use ResponseEntity object to return the required objects in the controllers