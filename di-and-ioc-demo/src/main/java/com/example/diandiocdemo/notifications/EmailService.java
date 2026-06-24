package com.example.diandiocdemo.notifications;

public class EmailService implements NotificationInterface {

    @Override
    public void sendNotification() {
        System.out.println("Email sent successfully");
    }
}
