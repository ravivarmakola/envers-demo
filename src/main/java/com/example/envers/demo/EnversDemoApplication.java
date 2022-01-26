package com.example.envers.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.envers.repository.config.EnableEnversRepositories;

@SpringBootApplication
@EnableEnversRepositories
public class EnversDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnversDemoApplication.class, args);
    }

}
