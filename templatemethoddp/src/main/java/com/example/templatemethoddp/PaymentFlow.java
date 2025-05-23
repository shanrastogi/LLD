package com.example.templatemethoddp;

public abstract class PaymentFlow {
    public abstract void initiatePayment();

    public abstract void debitMoney();

    public abstract void calculateFees();

    public abstract void creditMoney();

    public void sendMoney() {
        initiatePayment();
        debitMoney();
        calculateFees();
        creditMoney();
    }
}
