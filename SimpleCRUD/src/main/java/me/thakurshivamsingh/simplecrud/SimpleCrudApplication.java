package me.thakurshivamsingh.simplecrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication
public class SimpleCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleCrudApplication.class, args);
        System.out.println("Hello World!");
    }

}
