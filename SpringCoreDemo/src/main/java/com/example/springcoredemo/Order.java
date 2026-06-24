package com.example.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class Order {
    public void placeOrder() {
        System.out.println("Order Placed");
    }
}
