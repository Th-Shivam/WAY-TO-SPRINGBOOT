package me.thakurshivamsingh.beanscope;

import org.springframework.stereotype.Component;

@Component
public class Order {

    public Order() {
        System.out.println("Order constructor");
    }

    public void placeOrder(){
        System.out.println("Order Placed !");
    }

}
