package com.example.diandiocdemo.notifications;

public class SmsService implements NotificationInterface {
    @Override
    public void sendNotification() {
        System.out.println("SMS sent successfully");
    }
}
