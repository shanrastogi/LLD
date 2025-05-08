package com.example.vendingmachine.vendingStates;

import java.util.ArrayList;
import java.util.List;

import com.example.vendingmachine.Coin;
import com.example.vendingmachine.Item;
import com.example.vendingmachine.VendingMachine;

public class HasMoneyState implements State {
    public HasMoneyState() {
        System.out.println("@@Machine is in Has Money State@@");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        return;
    }

    @Override
    public void clickOnSelectProductButton(VendingMachine vendingMachine) throws Exception {
        vendingMachine.setCurrentSate(new SelectionState());
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        System.out.println("Coin of value " + coin.value + " accepted!!");
        vendingMachine.getCoins().add(coin);
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
        List<Coin> coins = vendingMachine.getCoins();
        vendingMachine.setCoins(new ArrayList<>());
        vendingMachine.setCurrentSate(new IdleState(vendingMachine));
        return coins;
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int productCode) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateInventory'");
    }

}
