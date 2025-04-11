package com.example.bridgedp.models;

public class QrMessage extends Notification {
    public QrMessage(NotificationSender notificationSender) {
        super(notificationSender);
    }

    @Override
    public void sendMessage() {
        System.out.print("Sending QR message ");
        notificationSender.sendNotification();
    }

}
