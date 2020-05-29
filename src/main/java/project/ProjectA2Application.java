package project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProjectA2Application {
	
	@GetMapping("/")
	public String home() {
		return "Hello World";
		}
	

	public static void main(String[] args) {
		SpringApplication.run(ProjectA2Application.class, args);
	}

}
