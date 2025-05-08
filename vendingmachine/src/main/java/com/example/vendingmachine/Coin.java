package com.example.vendingmachine;

public enum Coin {
    COIN_1(1),
    COIN_2(2),
    COIN_5(5),
    COIN_10(10),
    COIN_20(20),
    COIN_50(50);   

    public int value;

    Coin(int value) {
        this.value = value;
    }   
}
