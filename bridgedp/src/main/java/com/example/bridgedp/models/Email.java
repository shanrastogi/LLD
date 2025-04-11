package com.example.bridgedp.models;

public class Email implements NotificationSender {
    @Override
    public void sendNotification() {
        System.out.println("via email notification...");
    }
}
