package com.example.vendingmachine.vendingStates;
import java.util.List;

import com.example.vendingmachine.Coin;
import com.example.vendingmachine.Item;
import com.example.vendingmachine.VendingMachine;

public interface State {
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception;
    public void clickOnSelectProductButton(VendingMachine vendingMachine) throws Exception;
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception;
    public void chooseProduct(VendingMachine vendingMachine, int productCode) throws Exception;
    public int getChange(int returnChangeMoney) throws Exception;
    public Item dispenseProduct(VendingMachine vendingMachine, int productCode) throws Exception;
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception;
    public void updateInventory(VendingMachine vendingMachine,Item item, int productCode) throws Exception;
}
