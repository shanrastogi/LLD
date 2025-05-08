package com.example.vendingmachine;


import java.util.List;

import com.example.vendingmachine.vendingStates.State;

public class Main {
    public static void main(String[] args) {
       VendingMachine vendingMachine = new VendingMachine();  
       try{
            System.out.println("|");
            System.out.println("Filling up the inventory");
            System.out.println("|");
            fillInventory(vendingMachine);
            System.out.println("Inventory filled successfully");
            displayInventory(vendingMachine);
            System.out.println("|");
            System.out.println("Clicking on Insert Coin Button");
            System.out.println("|");
            State currentState = vendingMachine.getCurrentSate();
            currentState.clickOnInsertCoinButton(vendingMachine);

            currentState = vendingMachine.getCurrentSate();
            currentState.insertCoin(vendingMachine, Coin.COIN_10);
            currentState.insertCoin(vendingMachine, Coin.COIN_20);

            System.out.println("|");
            System.out.println("Clicking on Product Select Button");
            System.out.println("|");            
            currentState.clickOnSelectProductButton(vendingMachine);
            currentState = vendingMachine.getCurrentSate();

            currentState.chooseProduct(vendingMachine, 102);
            displayInventory(vendingMachine);

       }  catch(Exception e){
           displayInventory(vendingMachine);
       }
    }

    public static void fillInventory(VendingMachine vendingMachine) {
        List<ItemShelf> itemShelves = vendingMachine.getInventory().getInventory();
        System.out.println("Size of inventory: " + itemShelves.size());
        for(int i=0;i<itemShelves.size();i++){
            Item newItem = new Item();
            if(i >=0 && i<2){
                newItem.setType(ItemType.COKE);
                newItem.setPrice(10);
            } else if(i >=2 && i<4){
                newItem.setType(ItemType.PEPSI);
                newItem.setPrice(20);
            } else if(i >=4 && i<6){
                newItem.setType(ItemType.SODA);
                newItem.setPrice(30);
            } else if(i >=6 && i<8){
                newItem.setType(ItemType.WATER);
                newItem.setPrice(40);
            } else {
                newItem.setType(ItemType.MIRANDA);
                newItem.setPrice(50);
            }
            itemShelves.get(i).setItem(newItem);
            itemShelves.get(i).setAvailable(true);
        }
    }

    public static void displayInventory(VendingMachine vendingMachine) {
        List<ItemShelf> itemShelves = vendingMachine.getInventory().getInventory();
        System.out.println("-----------------------------");
        for(ItemShelf itemShelf: itemShelves){
            System.out.println("|");
            System.out.println("Product Code: " + itemShelf.getProductCode());
            System.out.println("Item Type: " + itemShelf.getItem().getType());
            System.out.println("Item Price: " + itemShelf.getItem().getPrice());
            System.out.println("Is Available: " + itemShelf.isAvailable());
            System.out.println("|");
        }
        System.out.println("-----------------------------");
    }
}