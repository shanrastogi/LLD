package com.example.tictactoe.Models;

public class PieceX extends PlayingPiece {
    public PieceX() {
        super(PieceType.X);
    }

    @Override
    public String toString() {
        return "X";
    }

}
