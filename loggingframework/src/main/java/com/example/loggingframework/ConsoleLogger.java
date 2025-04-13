package com.example.loggingframework;

public class ConsoleLogger implements LogObserver {
    @Override
    public void log(String message) {
        System.out.println("Console Logger: " + message);
    }

}
