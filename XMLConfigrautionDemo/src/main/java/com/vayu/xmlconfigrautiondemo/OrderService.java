package com.vayu.xmlconfigrautiondemo;

public class OrderService {

    PaymentService paymentService;

    public OrderService(PaymentService paymentService){
        System.out.println("OrderService constructor called .");
        this.paymentService = paymentService;
    }

    public void placeOrder(){
        paymentService.pay() ;
        System.out.println("Order placed ... !");

    }
}
