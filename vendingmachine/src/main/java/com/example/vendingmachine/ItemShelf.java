package com.example.vendingmachine;

public class ItemShelf {
    int productCode;
    Item item;
    boolean isAvailable;
    ItemShelf() {
        productCode = 0;
        item = null;
        isAvailable = false;
    }
    public int getProductCode() {
        return productCode;
    }
    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }
    public Item getItem() {
        return item;
    }
    public void setItem(Item item) {
        this.item = item;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}
