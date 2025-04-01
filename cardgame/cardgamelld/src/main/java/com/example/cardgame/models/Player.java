package com.example.cardgame.models;

public class Player {
    public int stake;
    public Hand hand;

    public Player() {
        this.stake = 0;
        this.hand = new Hand();
    }

    @Override
    public String toString() {
        return "Player{" +
                "stake=" + stake +
                ", hand=" + hand +
                '}';
    }
}
