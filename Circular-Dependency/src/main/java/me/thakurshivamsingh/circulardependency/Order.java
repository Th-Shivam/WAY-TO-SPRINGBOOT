package me.thakurshivamsingh.circulardependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Order {

    @Autowired
    private Payment payment;

//    public Order(Payment payment) {
//        this.payment = payment;
//    }

    public void placeOrder() {
        payment.pay();
        System.out.println("Order completed");
    }

    public void orderDetails(){
        System.out.println("Order Details");
    }
}
