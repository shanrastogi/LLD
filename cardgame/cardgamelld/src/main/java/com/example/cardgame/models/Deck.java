package com.example.cardgame.models;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    public List<BlackjackCard> cards;

    public Deck(){
        cards = new ArrayList<>();
        for(int suite = 0; suite < 4; suite++){
            for(int cardValue = 1; cardValue <=13; cardValue++){
                SuiteType suiteType = null;
                switch (suite) {
                    case 0:
                        suiteType = SuiteType.Spades;
                        break;
                    case 1:
                        suiteType = SuiteType.Hearts;
                        break;
                    case 2:
                        suiteType = SuiteType.Diamonds;
                        break;
                    case 3:
                        suiteType = SuiteType.Clubs;
                        break;
                }
                cards.add(new BlackjackCard(cardValue, suiteType));
            }
        }
    }

    public void shuffle() {
        List<BlackjackCard> shuffledDeck = new ArrayList<>();
        while (!cards.isEmpty()) {
            int randomIndex = (int) (Math.random() * cards.size());
            shuffledDeck.add(cards.remove(randomIndex));
        }
        cards = shuffledDeck;
    }

    public BlackjackCard drawCard() {
        if (cards.isEmpty()) {
            return null; // or throw an exception
        }
        return cards.remove(cards.size() - 1);
    }

    public int getDeckSize() {
        return cards.size();
    }
}
