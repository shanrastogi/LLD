package com.example.commanddp.Receiver;

public class Bulb {
    boolean isOn = false;

    public void turnOn() {
        isOn = true;
        System.out.println("Bulb is turned ON");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Bulb is turned OFF");
    }

}
