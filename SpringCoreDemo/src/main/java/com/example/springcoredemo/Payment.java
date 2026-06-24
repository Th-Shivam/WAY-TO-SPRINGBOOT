package com.example.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class Payment {
    public void pay() {
        System.out.println("payment succesfull .");
    }
}
