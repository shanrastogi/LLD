package com.example.chainofresponsibility.models;

public class Director extends Managers {
    public Director(int approvalLimit, String managerName) {
        this.managerName = managerName;
        this.approvalLimit = approvalLimit;
    }

    @Override
    protected void processSalary(int employeeSalary) {
        System.out.println(managerName + " has approved at level 3, the salary of " + employeeSalary);
    }

}
