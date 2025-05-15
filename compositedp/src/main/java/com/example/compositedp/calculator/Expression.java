package com.example.compositedp.calculator;

public class Expression implements ArithmeticExpression {
    private ArithmeticExpression left;
    private ArithmeticExpression right;
    private Operation operation;

    public Expression(ArithmeticExpression left, ArithmeticExpression right, Operation operation) {
        this.left = left;
        this.right = right;
        this.operation = operation;
    }

    @Override
    public int evaluate() {
        int leftValue = left.evaluate();
        int rightValue = right.evaluate();

        switch (operation) {
            case ADD:
                return leftValue + rightValue;
            case SUBTRACT:
                return leftValue - rightValue;
            case MULTIPLY:
                return leftValue * rightValue;
            case DIVIDE:
                return leftValue / rightValue;
            default:
                throw new UnsupportedOperationException("Operation not supported");
        }
    }
}
