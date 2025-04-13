package com.example.loggingframework;

/*
 * We used Singleton, Chain of Responsibility, and Observer design patterns to implement a logging framework.
 */

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        //logger.info("this is an info message");
         logger.error("this is an error message");
        // logger.debug("this is an debug message");
    }
}

