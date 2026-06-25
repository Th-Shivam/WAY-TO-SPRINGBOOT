package com.example.springcoredemo.payments;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // This will be used for dependency injection for type Payment
public class CardPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Paying via Card");
    }
}
