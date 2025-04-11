package com.example.chainofresponsibility.models;

public class CommandChainCreator {
    public Managers createChain() {
        // Create the chain of responsibility
        Managers hiringManager = new HiringManager(1000, "Hiring Manager");
        Managers seniorManager = new SeniorManager(20000, "Senior Manager");
        Managers director = new Director(30000, "Director");

        // Set the next manager in the chain
        hiringManager.setManager(seniorManager);
        seniorManager.setManager(director);

        return hiringManager;
    }
}