package me.thakurshivamsingh.beanscope;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Order {

    private Payment payment;

    public Order(Payment payment) {
        this.payment = payment;
        System.out.println("Order constructor");
    }

    public void placeOrder(){
        payment.pay();
        System.out.println("Order Placed !");
    }

}
