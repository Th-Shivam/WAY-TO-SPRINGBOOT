package me.thakurshivamsingh.beanlifecycle;

import org.springframework.stereotype.Component;

@Component
public class Payment {

    public void pay(){
        System.out.println("Payment completed !");
    }
}
