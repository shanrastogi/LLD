package com.example.snakesladders;

public class Board {
    Cell[][] cells;

    public Board(int BoardSize, int noOfSnakes, int noOfLadders) {
        // Initialize the board with the given size
        initializeBoard(BoardSize);
        // Initialize snakes and ladders
        initializeSnakesAndLadders(noOfSnakes, noOfLadders);

    }

    public void initializeBoard(int BoardSize) {
        cells = new Cell[BoardSize][BoardSize];
        for (int i = 0; i < BoardSize; i++) {
            for (int j = 0; j < BoardSize; j++) {
                cells[i][j] = new Cell();
            }
        }
    }

    public void initializeSnakesAndLadders(int noOfSnakes, int noOfLadders) {
        // Initialize snakes
        for (int i = 0; i < noOfSnakes; i++) {
            int start = (int) (Math.random() * (cells.length * cells.length - 1)) + 1;
            int end = (int) (Math.random() * (start - 1)) + 1;
            Cell cell = getCell(start);
            if (cell.jump != null) {
                // If there's already a jump, skip this iteration
                i--;
                continue;
            }
            cell.jump = new Jump(start, end);
            System.out.println("Snake created from : " + start + " : to : " + end);
        }

        // Initialize ladders
        for (int i = 0; i < noOfLadders; i++) {
            int start = (int) (Math.random() * (cells.length * cells.length - 1)) + 1;
            int end = (int) (Math.random() * ((cells.length * cells.length - start))) + start + 1;
            Cell cell = getCell(start);
            if (cell.jump != null) {
                // If there's already a jump, skip this iteration
                i--;
                continue;
            }
            cell.jump = new Jump(start, end);
            System.out.println("Ladder created from : " + start + " : to : " + end);
        }
    }

    Cell getCell(int position) {
        int row = position / cells.length;
        int col = position % cells.length;
        return cells[row][col];
    }
}
