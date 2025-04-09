package com.example.facadedp.models;

public class HardwareChecks {
    MotherBoard motherBoard;;
    RAM ram;

    HardwareChecks(){
        motherBoard = new MotherBoard();
        ram = new RAM();
    }

    boolean checkAllHardware(){
        boolean isMotherBoardOk = motherBoard.checkMotherBoard();
        boolean isRamOk = ram.checkRAM();
        if(isMotherBoardOk && isRamOk){
            System.out.println("All hardware components are working properly.");
            return true;
        }else{
            System.out.println("Some hardware components are not working properly.");
            return false;
        }
    }
}
