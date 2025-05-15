package com.example.compositedp;

import com.example.compositedp.calculator.ArithmeticExpression;
import com.example.compositedp.calculator.Expression;
import com.example.compositedp.calculator.MyNumber;
import com.example.compositedp.calculator.Operation;
import com.example.compositedp.filesystem.Directory;
import com.example.compositedp.filesystem.File;

public class Main {
    public static void main(String[] args) {
        // File system
        Directory movies = new Directory("Movies");
        movies.add(new File("Inception"));
        movies.add(new File("Interstellar"));
        Directory subDirectory = new Directory("Comedy");
        subDirectory.add(new File("The Hangover"));
        movies.add(subDirectory);
        movies.ls();

        // Calculator
        ArithmeticExpression number = new MyNumber(5);
        ArithmeticExpression number2 = new MyNumber(10);
        ArithmeticExpression number3 = new MyNumber(2);
        ArithmeticExpression addition = new Expression(number, number2, Operation.ADD);
        ArithmeticExpression multiplication = new Expression(addition, number3, Operation.MULTIPLY);
        System.out.println("Result: " + multiplication.evaluate());
    }
}