package com.example.chainofresponsibility.models;

public class SeniorManager extends Managers {
    public SeniorManager(int approvalLimit, String managerName) {
        this.managerName = managerName;
        this.approvalLimit = approvalLimit;
    }

    @Override
    protected void processSalary(int employeeSalary) {
        System.out.println(managerName + " has approved at level 2, the salary of " + employeeSalary);
    }

}
