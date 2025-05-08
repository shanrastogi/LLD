package com.example.vendingmachine;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    List<ItemShelf> inventory;
    Inventory(int itemCount) {
        inventory = new ArrayList<ItemShelf>(itemCount);
        initializeEmptyInventory(itemCount);
    }

    public List<ItemShelf> getInventory() {
        return inventory;
    }

    public void setInventory(List<ItemShelf> inventory) {
        this.inventory = inventory;
    }

    public void initializeEmptyInventory(int itemCount) {
        int startCode = 101;
        for(int i=0;i < itemCount;i++){
            ItemShelf itemShelf = new ItemShelf();
            itemShelf.setProductCode(startCode + i);
            itemShelf.setItem(null);
            itemShelf.setAvailable(false);
            inventory.add(itemShelf);
        }
        
    }

    public void addItem(Item item, int productCode) throws Exception {
        for(ItemShelf itemshelf: inventory){
            if(itemshelf.getProductCode() == productCode){
                itemshelf.setItem(item);
                itemshelf.setAvailable(true);
                return;
            } else {
                throw new Exception("Item is already present in the inventory with the same product code");
            }
        }
    }

    public Item getItem(int productCode) throws Exception {
        for(ItemShelf itemshelf: inventory){
            if(itemshelf.getProductCode() == productCode){
                if(itemshelf.isAvailable()){
                    return itemshelf.item;
                } else {
                    throw new Exception("Item is not available it is sold out!!");
                }
            }
        }
        throw new Exception("Item is not present in the inventory!!");
    }

    public void updateIsAvailable(int productCode) {
        for(ItemShelf itemShelf: inventory){
            if(itemShelf.getProductCode() == productCode){
                itemShelf.setAvailable(false);
                return;
            }
        }
    }

}
