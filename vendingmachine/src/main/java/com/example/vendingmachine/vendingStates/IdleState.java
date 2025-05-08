package com.example.vendingmachine.vendingStates;

import java.util.ArrayList;
import java.util.List;

import com.example.vendingmachine.Coin;
import com.example.vendingmachine.Item;
import com.example.vendingmachine.VendingMachine;

public class IdleState implements State{

    public IdleState(){
        System.out.println("@@Machine is in Idle State@@");
    }

    public IdleState(VendingMachine vendingMachine) {
        System.out.println("@@Machine is in Idle State@@");
        vendingMachine.setCoins(new ArrayList<>());
    }
   
    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        vendingMachine.setCurrentSate(new HasMoneyState());
    }

    @Override
    public void clickOnSelectProductButton(VendingMachine vendingMachine) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clickOnSelectProductButton', you can not select product without inserting coins!!");
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dispenseProduct'");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'refundFullMoney'");
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int productCode) throws Exception {
       vendingMachine.getInventory().addItem(item, productCode);
    }

}
