package com.example.tictactoe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.example.tictactoe.Models.Board;
import com.example.tictactoe.Models.Player;
import com.example.tictactoe.Models.PlayingPiece;

import javafx.util.Pair;

import com.example.tictactoe.Models.PieceType;

public class Game {
    Deque<Player> players;
    Board board;

    Game() {
        initalizeGame();
    }

    public void initalizeGame() {
        board = new Board(3);
        players = new LinkedList<>();
        // Initialize players with their respective pieces
        Player player1 = new Player("Player 1", new PlayingPiece(PieceType.X));
        Player player2 = new Player("Player 2", new PlayingPiece(PieceType.O));
        players.add(
                player1);
        players.add(
                player2);
    }

    public void startGame() {
        boolean noWinner = true;
        while (noWinner) {
            Player currentPlayer = players.pollFirst();
            board.printBoard();
            System.out.println(currentPlayer.getName() + "'s turn");
            System.out.println("Enter the row and column to place your piece (0-2): ");
            List<Pair<Integer, Integer>> availablePositions = board.getAvailablePositions();
            if (availablePositions.isEmpty()) {
                System.out.println("It's a draw! No more available positions.");
                break;
            }

            // take input from user
            @SuppressWarnings("resource")
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            String[] parts = input.split(",");
            int row = Integer.parseInt(parts[0]);
            int col = Integer.parseInt(parts[1]);
            boolean setPieceResult = board.setPiece(row, col, currentPlayer.getPiece());
            if (setPieceResult) {
                System.out.println("Piece placed successfully.");
            } else {
                System.out.println("Invalid position. Try again.");
                players.addFirst(currentPlayer); // Add the player back to the front of the queue
                continue; // Skip to the next iteration of the loop
            }
            boolean winResult = board.checkWin(currentPlayer.getPiece());
            if (winResult) {
                board.printBoard();
                System.out.println(currentPlayer.getName() + " wins!");
                noWinner = false;
                break;
            } else if (board.isFull()) {
                board.printBoard();
                System.out.println("It's a draw! No more available positions.");
                break;
            }
            // If no winner, add the player back to the end of the queue
            players.addLast(currentPlayer);
        }
    }
}
