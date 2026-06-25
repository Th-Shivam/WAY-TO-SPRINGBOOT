package me.thakurshivamsingh.circulardependency;

import org.springframework.stereotype.Component;

@Component
public class Order {

    private Payment payment;

    public Order(Payment payment) {
        this.payment = payment;
    }

    public void order() {
        payment.pay();
        System.out.println("Order completed");
    }

    public void orderDetails(){
        System.out.println("Order Details");
    }
}
