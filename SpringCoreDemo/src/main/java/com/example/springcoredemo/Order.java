package com.example.springcoredemo;

import com.example.springcoredemo.payments.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Order {

    private Payment payment;

    @Autowired
    public Order(Payment payment) {
        this.payment = payment;
    }

    public void placeOrder() {

        payment.pay();
        System.out.println("Order Placed");
    }
}
