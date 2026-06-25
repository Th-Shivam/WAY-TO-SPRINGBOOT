package me.thakurshivamsingh.circulardependency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class CircularDependencyApplication {

    public static void main(String[] args) {

    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

    }

}
