package com.example.interpreter;

public class BinaryNonTerminalExpression implements AbstractExpression {
    private AbstractExpression left;
    private AbstractExpression right;
    private String operator;

    public BinaryNonTerminalExpression(AbstractExpression left, AbstractExpression right, String operator) {
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    @Override
    public int interpret(Context context) {
        int leftValue = left.interpret(context);
        int rightValue = right.interpret(context);

        switch (operator) {
            case "+":
                return leftValue + rightValue;
            case "-":
                return leftValue - rightValue;
            case "*":
                return leftValue * rightValue;
            case "/":
                return leftValue / rightValue;
            default:
                throw new UnsupportedOperationException("Operator " + operator + " is not supported.");
        }
    }

}
