package com.example.cardgame.models;

import java.util.ArrayList;
import java.util.List;

public class Shoe {
    public List<Deck> decks;

    public Shoe(int numberOfDecks) {
        decks = new ArrayList<>();
        for (int i = 0; i < numberOfDecks; i++) {
            decks.add(new Deck());
        }
    }

    public void shuffle() {
        for (Deck deck : decks) {
            deck.shuffle();
        }
    }

    public BlackjackCard drawCard() {
        if (decks.isEmpty()) {
            return null; // or throw an exception
        }
        Deck deck = decks.get(decks.size() - 1);
        BlackjackCard card = deck.drawCard();
        if (deck.getDeckSize() == 0) {
            decks.remove(deck); // Remove the empty deck
        }
        return card;
    }

    public boolean isEmpty() {
        for (Deck deck : decks) {
            if (deck.getDeckSize() == 0) {
                return false;
            }
        }
        return true;
    }
}
