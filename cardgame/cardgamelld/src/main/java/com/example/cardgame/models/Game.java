package com.example.cardgame.models;

import java.util.ArrayList;
import java.util.List;

public class Game {
    public Shoe shoe;
    public List<Player> players;
    
    public Game(int numberOfDecks) {
        this.shoe = new Shoe(numberOfDecks);
        this.players = new ArrayList<>();
    }

    public void addPlayer() {
        players.add(new Player());
    }

    public void run() {
        // 1. Prepare for the round
        shoe.shuffle(); // Shuffle the deck(s)
        for (Player player : players) {
            player.stake = 100; // Reset stake for the round
            player.hand.clearHand(); // Clear previous cards
        }

        // Check if there are enough cards to deal initial hands
        if (shoe == null || (players.size() * 2 > shoe.decks.get(0).getDeckSize())) {
             System.out.println("Not enough cards in the shoe to start the game.");
             return;
        }

        // 2. Deal initial hands (2 cards each)
        System.out.println("--- Dealing Initial Hands ---");
        for (int i = 0; i < 2; ++i) {
            for (Player player : players) {
                 BlackjackCard dealtCard = shoe.drawCard();
                 if(dealtCard != null) {
                     player.hand.addCard(dealtCard);
                 } else {
                     System.out.println("Error: Ran out of cards during initial deal.");
                     return; // Stop the game if cards run out unexpectedly
                 }
            }
        }

        // Show initial hands (optional, but good for visibility)
        for (Player player : players) {
            int playerIndex = players.indexOf(player);
            System.out.println("Player " + (playerIndex + 1) + " initial hand: " + player.hand);
        }
        System.out.println("-----------------------------");


        // 3. Player turns (Simplified: Hit until soft value >= 17)
        System.out.println("--- Player Turns ---");
        for (Player player : players) {
            int playerIndex = players.indexOf(player);
            System.out.println("Player " + (playerIndex + 1) + "'s turn:");
            while (player.hand.softValue() < 17) {
                System.out.println("  Player " + (playerIndex + 1) + " hits (Current: " + player.hand.softValue() + ")");
                BlackjackCard dealtCard = shoe.drawCard();
                if (dealtCard != null) {
                    player.hand.addCard(dealtCard);
                    System.out.println("  Received: " + dealtCard.value + " | New Hand: " + player.hand);
                     // Check for bust immediately after hit
                    if (player.hand.softValue() > 21) {
                        System.out.println("  Player " + (playerIndex + 1) + " BUSTS!");
                        break; // Stop hitting if busted
                    }
                } else {
                    System.out.println("  Shoe is empty, cannot hit.");
                    break; // Stop hitting if no cards left
                }
            }
            // Final hand status for the player
            if (player.hand.softValue() <= 21) {
                 System.out.println("  Player " + (playerIndex + 1) + " stands with: " + player.hand.softValue());
            }
        }
         System.out.println("--------------------");

        // 4. Determine Winner(s)
        System.out.println("--- Determining Winner ---");
        int maxValidValue = 0;
        // Find the highest non-busted score
        for (Player player : players) {
            int finalValue = player.hand.softValue();
            if (finalValue <= 21 && finalValue > maxValidValue) {
                maxValidValue = finalValue;
            }
        }

        // Announce winners
       // boolean winnerFound = false;
        if (maxValidValue == 0) {
            System.out.println("All players busted!");
        } else {
            System.out.println("Winning score: " + maxValidValue);
            for (Player player : players) {
                if (player.hand.softValue() == maxValidValue) {
                    int playerIndex = players.indexOf(player);
                    System.out.println("Player " + (playerIndex + 1) + " wins!");
                    //winnerFound = true;
                    // In a real game, update stake here based on win/loss/push
                }
            }
        }
         System.out.println("------------------------");
    }
}
