package com.example.templatemethoddp;

public class PayToMerchant extends PaymentFlow {
    @Override
    public void initiatePayment() {
        System.out.println("Initiating payment to merchant...");
    }

    @Override
    public void debitMoney() {
        System.out.println("Debiting money from account...");
    }

    @Override
    public void calculateFees() {
        System.out.println("Calculating fees for sending money to merchant, 2% extra charges...");
    }

    @Override
    public void creditMoney() {
        System.out.println("Crediting money to merchant's account...");
    }

}
