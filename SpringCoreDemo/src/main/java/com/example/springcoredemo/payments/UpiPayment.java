package com.example.springcoredemo.payments;

import org.springframework.stereotype.Component;

@Component
public class UpiPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Paying via UPI");
    }
}
