package com.example.vendingmachine;

import java.util.ArrayList;
import java.util.List;

import com.example.vendingmachine.vendingStates.IdleState;
import com.example.vendingmachine.vendingStates.State;

public class VendingMachine {
    private State currentSate;
    private List<Coin> coins;
    private Inventory inventory;
    public VendingMachine() {
        this.currentSate = new IdleState();
        this.coins = new ArrayList<>();
        this.inventory = new Inventory(10);
    }
    public State getCurrentSate() {
        return currentSate;
    }
    public void setCurrentSate(State currentSate) {
        this.currentSate = currentSate;
    }
    public List<Coin> getCoins() {
        return coins;
    }
    public void setCoins(List<Coin> coins) {
        this.coins = coins;
    }
    public Inventory getInventory() {
        return inventory;
    }
    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
