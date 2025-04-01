package com.example.cardgame.models;

public class Card {
    public int value;
    public SuiteType suiteType;
    Card(int value, SuiteType suiteType) {
        this.value = value;
        this.suiteType = suiteType;
    }
    public int getValue() {
        return value;
    }
    public SuiteType getSuiteType() {
        return suiteType;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public void setSuiteType(SuiteType suiteType) {
        this.suiteType = suiteType;
    }
    @Override
    public String toString() {
        String rank;
        switch (value) {
            case 1:
                rank = "Ace";
                break;
            case 11:
                rank = "Jack";
                break;
            case 12:
                rank = "Queen";
                break;
            case 13:
                rank = "King";
                break;
            default:
                rank = String.valueOf(value);
        }
        return rank + " of " + suiteType;        
    }
}
