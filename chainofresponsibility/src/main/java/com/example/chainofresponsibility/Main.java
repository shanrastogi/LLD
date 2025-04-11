package com.example.chainofresponsibility;

import com.example.chainofresponsibility.models.CommandChainCreator;
import com.example.chainofresponsibility.models.Managers;

public class Main {
    public static void main(String[] args) {
        CommandChainCreator commandChainCreator = new CommandChainCreator();
        Managers manager = commandChainCreator.createChain();
        manager.approveSalary(500);
        manager.approveSalary(15000);
        manager.approveSalary(25000);
        manager.approveSalary(500000);
    }
}