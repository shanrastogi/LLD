package com.example.facadedp.models;

public class LaptopOnSwitch {
    private HardwareChecks hardwareChecks;
    private SoftwareChecks softwareChecks;

    public LaptopOnSwitch() {
        hardwareChecks = new HardwareChecks();
        softwareChecks = new SoftwareChecks();
    }

    public void performCheckAndSwitchOn(){
        System.out.println("Performing checks on laptop startup...");
        hardwareChecks.checkAllHardware();
        softwareChecks.checkAllSoftware();
        System.out.println("All checks passed. Laptop is ready to use.");
    }
}
