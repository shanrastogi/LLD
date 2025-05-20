package com.example.flyweight.WordProcessor;

public class DocumentLetter implements ILetter {
    private String letter;
    private String font;
    private int size;

    public DocumentLetter(String letter, String font, int size) {
        this.letter = letter;
        this.font = font;
        this.size = size;
    }

    @Override
    public void display(int row, int col) {
        System.out.println("Displaying letter: " + letter + " at (" + row + ", " + col + ") with font: " + font
                + " and size: " + size);
    }

}
