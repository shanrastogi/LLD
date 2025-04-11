package com.example.bridgedp;

import com.example.bridgedp.models.Email;
import com.example.bridgedp.models.Notification;
import com.example.bridgedp.models.NotificationSender;
import com.example.bridgedp.models.QrMessage;
import com.example.bridgedp.models.Sms;
import com.example.bridgedp.models.TextMessage;

public class Main {
    public static void main(String[] args) {
        NotificationSender email = new Email();
        NotificationSender sms = new Sms();

        Notification qrMessage = new QrMessage(email);
        qrMessage.sendMessage();

        Notification smsMessage = new TextMessage(sms);
        smsMessage.sendMessage();

    }
}