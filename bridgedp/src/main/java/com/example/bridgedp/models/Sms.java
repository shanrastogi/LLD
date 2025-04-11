package com.example.bridgedp.models;

public class Sms implements NotificationSender {
    @Override
    public void sendNotification() {
        System.out.println("via SMS notification...");
    }

}
