package com.example.cardgame;

import java.util.Scanner;
import com.example.cardgame.models.Game;

public class Main {
    public static void main(String[] args) {
        try (// Create a new game instance
        Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the number of players:");
            int numberOfPlayers = scanner.nextInt();

            System.out.println("Enter the number of decks:");
            int numberOfDecks = scanner.nextInt();

            Game game = new Game(numberOfDecks);    
            for(int i = 0; i < numberOfPlayers; i++){
                game.addPlayer();
            }        
            game.run();
        }
    }
}