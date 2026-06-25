package com.example.springcoredemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.example.springcoredemo")
public class AppConfig {

    @Bean
    public User user() {
        return new User("Shivam" , 21);
    }

}
