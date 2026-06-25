package me.thakurshivamsingh.circulardependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Payment {

    @Autowired
    private Order order;

//    public Payment(Order order) {
//        this.order = order;
//    }

    public void pay(){
        order.orderDetails();
        System.out.println("Payment method executed");
    }

}
