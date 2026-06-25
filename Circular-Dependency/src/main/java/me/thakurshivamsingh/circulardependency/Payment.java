package me.thakurshivamsingh.circulardependency;

import org.springframework.stereotype.Component;

@Component
public class Payment {
    private Order order;

    public Payment(Order order) {
        this.order = order;
    }

    public void pay(){
        System.out.println(order.orderDetails());
        System.out.println("Payment method executed");
    }

}
