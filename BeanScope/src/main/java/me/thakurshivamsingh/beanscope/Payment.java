package me.thakurshivamsingh.beanscope;

import org.springframework.stereotype.Component;

@Component
public class Payment {

    public Payment() {
        System.out.println("Payment constructor");
    }

    public void pay(){
        System.out.println("payment done");
    }
}
