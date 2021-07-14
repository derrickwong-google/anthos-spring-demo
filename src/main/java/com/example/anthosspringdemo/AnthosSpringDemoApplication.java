package com.example.anthosspringdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AnthosSpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnthosSpringDemoApplication.class, args);
    }
    
    @GetMapping("/greeting/{name}")
    public String greeting(@PathVariable String name){
        return "Hi " + name + "! How are you?";
    }

}
