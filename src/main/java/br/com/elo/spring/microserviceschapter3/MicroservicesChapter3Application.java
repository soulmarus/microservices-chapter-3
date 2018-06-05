package br.com.elo.spring.microserviceschapter3;

import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MicroservicesChapter3Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesChapter3Application.class, args);
	}
}

@RestController
class GreetingController{

	@GetMapping("/")
	Greet greet() {
		return new Greet("Hello World!");
	}
}

@Data
class Greet {
	private String message;

	public Greet(String message) {
		this.message = message;
	}
}