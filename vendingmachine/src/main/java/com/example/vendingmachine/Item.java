package com.example.vendingmachine;

public class Item {
    ItemType Type;
    int Price;
    public Item() {
        Type = null;
        Price = 0;
    }
    public Item(ItemType type, int price) {
        Type = type;
        Price = price;
    }
    public ItemType getType() {
        return Type;
    }
    public void setType(ItemType type) {
        Type = type;
    }
    public int getPrice() {
        return Price;
    }
    public void setPrice(int price) {
        Price = price;
    }
}
