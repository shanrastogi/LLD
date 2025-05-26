package com.example.tictactoe.Models;

import java.util.ArrayList;
import java.util.List;
import javafx.util.Pair;

public class Board {
    public int size;
    public PlayingPiece[][] board;

    public Board(int size) {
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public PlayingPiece getPiece(int row, int col) {
        return board[row][col];
    }

    public boolean setPiece(int row, int col, PlayingPiece piece) {
        if (row < 0 || row >= size || col < 0 || col >= size) {
            return false; // Invalid position
        }
        if (board[row][col] != null) {
            return false; // Position already occupied
        }
        board[row][col] = piece;
        return true; // Piece placed successfully
    }

    public List<Pair<Integer, Integer>> getAvailablePositions() {
        List<Pair<Integer, Integer>> availablePositions = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    availablePositions.add(new Pair<>(i, j));
                }
            }
        }
        return availablePositions;
    }

    public boolean isFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkWin(PlayingPiece piece) {
        // Check rows and columns
        for (int i = 0; i < size; i++) {
            boolean rowWin = true;
            boolean colWin = true;
            for (int j = 0; j < size; j++) {
                if (board[i][j] != piece) {
                    rowWin = false;
                }
                if (board[j][i] != piece) {
                    colWin = false;
                }
            }
            if (rowWin || colWin) {
                return true;
            }
        }

        // Check diagonals
        boolean diag1Win = true;
        boolean diag2Win = true;
        for (int i = 0; i < size; i++) {
            if (board[i][i] != piece) {
                diag1Win = false;
            }
            if (board[i][size - 1 - i] != piece) {
                diag2Win = false;
            }
        }
        return diag1Win || diag2Win;
    }

    public void reset() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = null;
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    System.out.print("- ");
                } else {
                    System.out.print(board[i][j].pieceType.toString() + " ");
                }
            }
            System.out.println(" | ");
        }
    }

}
