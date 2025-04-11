package com.example.chainofresponsibility.models;

public class HiringManager extends Managers {
    public HiringManager(int approvalLimit, String managerName) {
        this.managerName = managerName;
        this.approvalLimit = approvalLimit;
    }

    @Override
    protected void processSalary(int employeeSalary) {
        System.out.println(managerName + " has approved at level 1, the salary of " + employeeSalary);
    }

}
