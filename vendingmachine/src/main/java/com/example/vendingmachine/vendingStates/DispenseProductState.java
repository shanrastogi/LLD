package com.example.vendingmachine.vendingStates;

import java.util.List;

import com.example.vendingmachine.Coin;
import com.example.vendingmachine.Item;
import com.example.vendingmachine.VendingMachine;

public class DispenseProductState implements State {

    DispenseProductState(VendingMachine vendingMachine, int productCode) throws Exception {
        System.out.println("@@Machine is in Dispense Product State@@");
        dispenseProduct(vendingMachine, productCode);
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clickOnInsertCoinButton'");
    }

    @Override
    public void clickOnSelectProductButton(VendingMachine vendingMachine) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clickOnSelectProductButton'");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertCoin'");
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int productCode) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'chooseProduct'");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getChange'");
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int productCode) throws Exception {
        System.out.println("Dispensing product with code " + productCode);
        Item item = vendingMachine.getInventory().getItem(productCode);
        if(item != null){
            vendingMachine.getInventory().updateIsAvailable(productCode);
            vendingMachine.setCurrentSate(new IdleState(vendingMachine));
            return item;
        } else {
            throw new Exception("Item is not present in the inventory!!");
        }
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'refundFullMoney'");
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int productCode) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateInventory'");
    }

}
