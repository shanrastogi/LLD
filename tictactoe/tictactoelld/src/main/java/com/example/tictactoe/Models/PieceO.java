package com.example.tictactoe.Models;

public class PieceO extends PlayingPiece {
    public PieceO() {
        super(PieceType.O);
    }

    @Override
    public String toString() {
        return "O";
    }

}
