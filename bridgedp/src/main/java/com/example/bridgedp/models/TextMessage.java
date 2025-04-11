package com.example.bridgedp.models;

public class TextMessage extends Notification {
    public TextMessage(NotificationSender notificationSender) {
        super(notificationSender);
    }

    @Override
    public void sendMessage() {
        System.out.print("Sending text message ");
        notificationSender.sendNotification();
    }

}
