package com.example.templatemethoddp;

public class PayToFriend extends PaymentFlow {
    @Override
    public void initiatePayment() {
        System.out.println("Initiating payment to friend...");
    }

    @Override
    public void debitMoney() {
        System.out.println("Debiting money from account...");
    }

    @Override
    public void calculateFees() {
        System.out.println("Calculating fees for sending money to friend, 0% extra charges...");
    }

    @Override
    public void creditMoney() {
        System.out.println("Crediting money to friend's account...");
    }

}
