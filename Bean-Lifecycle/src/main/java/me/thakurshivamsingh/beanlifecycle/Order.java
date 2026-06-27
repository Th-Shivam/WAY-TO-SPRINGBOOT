package me.thakurshivamsingh.beanlifecycle;

import org.springframework.stereotype.Component;

@Component
public class Order {

    private Payment payment;

    public Order(Payment payment) {
        this.payment = payment;
        System.out.println("Order Constructor called...");
    }

    public void placeOrder() {
        System.out.println("Order placed....!");
    }
}
