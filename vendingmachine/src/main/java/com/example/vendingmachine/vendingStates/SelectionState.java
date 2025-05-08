package com.example.vendingmachine.vendingStates;

import java.util.List;

import com.example.vendingmachine.Coin;
import com.example.vendingmachine.Item;
import com.example.vendingmachine.VendingMachine;

public class SelectionState implements State{

    public SelectionState(){
        System.out.println("@@Machine is in Selection State@@");
    }    

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clickOnInsertCoinButton'");
    }

    @Override
    public void clickOnSelectProductButton(VendingMachine vendingMachine) throws Exception {
       return;
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertCoin'");
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int productCode) throws Exception {
        Item item = vendingMachine.getInventory().getItem(productCode);
        int amountPaidByUser = 0;
        for(Coin coin: vendingMachine.getCoins()){
            amountPaidByUser += coin.value;
        }
        if(amountPaidByUser < item.getPrice()){
            System.out.println("Not enough money to buy the product!! You paid " + amountPaidByUser + " and the product price is " + item.getPrice());
            refundFullMoney(vendingMachine);
            throw new Exception("insufficient money to buy the product!!");
        } else {
            if(amountPaidByUser > item.getPrice()){
                getChange(amountPaidByUser - item.getPrice());
            }
            vendingMachine.setCurrentSate(new DispenseProductState(vendingMachine, productCode));
        }
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        System.out.println("Returning change of " + returnChangeMoney + "rupees!!");
        return returnChangeMoney;
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int productCode) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dispenseProduct'");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        System.out.println("Refunding full money!!");
        vendingMachine.setCurrentSate(new IdleState(vendingMachine));
        return vendingMachine.getCoins();
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int productCode) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateInventory'");
    }

}
