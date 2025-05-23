package com.example.templatemethoddp;

public class Main {
    public static void main(String[] args) {
        PaymentFlow payToFriend = new PayToFriend();
        payToFriend.sendMoney();

        System.out.println("-------------------------------------------------");

        PaymentFlow payToMerchant = new PayToMerchant();
        payToMerchant.sendMoney();
        System.out.println("-------------------------------------------------");
    }
}