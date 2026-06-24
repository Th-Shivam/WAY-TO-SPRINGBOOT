package com.example.diandiocdemo;

import com.example.diandiocdemo.notifications.EmailService;
import com.example.diandiocdemo.notifications.NotificationInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiAndIocDemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DiAndIocDemoApplication.class, args);
        NotificationInterface notification = new EmailService();
        OrderService  orderService = new OrderService(notification);
        orderService.PlaceOrder();
    }

}
