package com.example.cardgame.models;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    public List<BlackjackCard> cards;
    public Hand(){
        cards = new ArrayList<>();
    }
    public void addCard(BlackjackCard card){
        if(card != null){
            cards.add(card);
        }        
    }

    public int hardValue(){
        int value = 0;
        for(BlackjackCard card : cards){
            value += card.getValue();
        }
        return value;
    }

    public int softValue(){
        int value = 0;
        int aceCount = 0;
        for(BlackjackCard card : cards){
            value += card.getValue();
            if(card.getValue() == 1){
                aceCount++;
            }
        }
        while(value <= 11 && aceCount > 0){
            value += 10;
            aceCount--;
        }
        return value;
    }

    public void clearHand(){
        cards.clear();
    }

    @Override
    public String toString() {
        StringBuilder handString = new StringBuilder();
        for (BlackjackCard card : cards) {
            handString.append(card.toString()).append(", ");
        }
        handString.append("(Hard: ").append(hardValue());
        handString.append(", Soft: ").append(softValue()).append(")");
        return handString.toString();
    }
}
