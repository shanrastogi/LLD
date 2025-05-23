package com.example.interpreter;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.assign("x", 5);
        context.assign("y", 10);

        AbstractExpression x = new TerminalExpression("x");
        AbstractExpression y = new TerminalExpression("y");
        AbstractExpression expression = new BinaryNonTerminalExpression(x, y, "+");

        int result = expression.interpret(context);
        System.out.println("Result: " + result); // Output: Result: 15

        // Testing with different operators
        AbstractExpression expression2 = new BinaryNonTerminalExpression(x, y, "-");
        int result2 = expression2.interpret(context);
        System.out.println("Result: " + result2); // Output: Result: -5

        AbstractExpression expression3 = new BinaryNonTerminalExpression(x, y, "*");
        int result3 = expression3.interpret(context);
        System.out.println("Result: " + result3); // Output: Result: 50

        AbstractExpression expression4 = new BinaryNonTerminalExpression(x, y, "/");
        int result4 = expression4.interpret(context);
        System.out.println("Result: " + result4); // Output: Result: 0

        // Testing with unsupported operator
        try {
            AbstractExpression expression5 = new BinaryNonTerminalExpression(x, y, "%");
            int result5 = expression5.interpret(context);
            System.out.println("Result: " + result5);
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage()); // Output: Operator % is not supported.
        }
    }
}