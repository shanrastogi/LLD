package com.example.facadedp.models;

public class SoftwareChecks {
    DriverChecks driverChecks;
    OsChecks osChecks;

    SoftwareChecks() {
        driverChecks = new DriverChecks();
        osChecks = new OsChecks();
    }

    boolean checkAllSoftware() {
        System.out.println("Checking all software components...");
        boolean driverCheck = driverChecks.checkAllDrivers();
        boolean osCheck = osChecks.checkOs();
        if (driverCheck && osCheck) {
            System.out.println("All software components are working properly.");
            return true;
        } else {
            System.out.println("Some software components are not working properly.");
            return false;
        }
    }
}
