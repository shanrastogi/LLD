package com.example.compositedp.calculator;

public class MyNumber implements ArithmeticExpression {
    private int number;

    public MyNumber(int number) {
        this.number = number;
    }

    @Override
    public int evaluate() {
        System.out.println("Evaluating number: " + number);
        return number;
    }

}
