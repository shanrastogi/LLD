package com.example.chainofresponsibility.models;

public abstract class Managers {
    protected Managers manager;
    String managerName;
    int approvalLimit;

    public void setManager(Managers manager) {
        this.manager = manager;
    }

    public void approveSalary(int employeeSalary) {
        if (employeeSalary <= approvalLimit) {
            processSalary(employeeSalary);
        } else if (manager != null) {
            System.out.println(managerName + " cannot approve the salary of " + employeeSalary);
            System.out.println("Checking for higher authority...");
            manager.approveSalary(employeeSalary);
        } else {
            System.out.println("No manager available to approve the salary of " + employeeSalary);
            System.out.println("Cannot make offer to the employee.");
        }
    }

    protected abstract void processSalary(int employeeSalary);

}

