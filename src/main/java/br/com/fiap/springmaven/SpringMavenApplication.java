package br.com.fiap.springmaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
//@RestController
//@EnableWebMvc
public class SpringMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMavenApplication.class, args);
	}

}
