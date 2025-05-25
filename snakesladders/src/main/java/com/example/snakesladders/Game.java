package com.example.snakesladders;

import java.util.Deque;

public class Game {
    Board board;
    Deque<Player> players;
    Dice dice;
    Player winner;

    public Game() {
        initalizeGame();
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Welcome to the Snakes and Ladders Game!");
        System.out.println("Game started!");
    }

    private void initalizeGame() {
        board = new Board(10, 5, 5);
        dice = new Dice(1);
        winner = null;
        addPlayers();
    }

    private void addPlayers() {
        players = new java.util.LinkedList<>();
        players.add(new Player(1, "Ram", 0));
        players.add(new Player(2, "Om", 0));
    }

    public void startGame() {
        while (winner == null) {
            Player currentPlayer = getCurrentPlayer();
            System.out.println("Current Player: " + currentPlayer.name + " at position: " + currentPlayer.position);
            int diceValue = dice.rollDice();
            System.out.println("Dice rolled value: " + diceValue);
            int playerNewPosition = currentPlayer.position + diceValue;
            // check if the new position has a jump (snake or ladder)
            playerNewPosition = jumpCheck(playerNewPosition);
            if (playerNewPosition >= board.cells.length * board.cells.length) {
                // Player has reached or exceeded the last cell
                winner = currentPlayer;
                System.out.println("Winner is: " + currentPlayer.name);
            } else {
                // Update player's position
                currentPlayer.position = playerNewPosition;
                System.out.println(currentPlayer.name + " moved to position: " + currentPlayer.position);
            }
        }
    }

    private Player getCurrentPlayer() {
        if (players.isEmpty()) {
            return null; // No players left
        }
        Player currentPlayer = players.poll();
        players.offer(currentPlayer); // Move the player to the end of the queue
        return currentPlayer;
    }

    private int jumpCheck(int playerNewPosition) {
        if (playerNewPosition >= board.cells.length * board.cells.length) {
            return playerNewPosition; // No further movement needed
        }
        Cell cell = board.getCell(playerNewPosition);
        if (cell.jump != null && cell.jump.start == playerNewPosition) {
            // If there's a jump at the new position, move to the end of the jump
            String jumpType = (cell.jump.end > cell.jump.start) ? "ladder" : "snake";
            System.out.println("Jump found from " + cell.jump.start + " to " + cell.jump.end + " (" + jumpType + ")");
            return cell.jump.end; // Move to the end of the jump
        }
        return playerNewPosition; // No jump, stay at the new position
    }
}
