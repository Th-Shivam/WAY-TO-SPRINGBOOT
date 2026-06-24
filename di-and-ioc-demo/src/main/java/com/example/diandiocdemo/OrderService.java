package com.example.diandiocdemo;

import com.example.diandiocdemo.notifications.NotificationInterface;

public class OrderService {

    NotificationInterface notification;
    public OrderService(NotificationInterface notification) {
        this.notification = notification;
    }
    public void PlaceOrder() {
        System.out.println("Order Placed successfully");
        notification.sendNotification();

    }
}
