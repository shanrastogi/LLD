package com.example.flyweight.WordProcessor;

public class Main {
    public static void main(String[] args) {
        ILetter letterA = LetterFactory.createLetter("A", "Arial", 12);
        letterA.display(0, 0);
        ILetter letterAComic = LetterFactory.createLetter("A", "Comic", 12);
        letterAComic.display(0, 1);
        ILetter letterASmall = LetterFactory.createLetter("A", "Arial", 4);
        letterASmall.display(0, 2);
        ILetter letterA2 = LetterFactory.createLetter("A", "Arial", 12);
        letterA2.display(1, 0);
    }
}
