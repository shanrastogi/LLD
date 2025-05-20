package com.example.commanddp.Receiver;

public class AirConditioner {
    boolean isOn = false;
    int temperature;

    public void turnOn() {
        isOn = true;
        System.out.println("Air Conditioner is turned ON");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Air Conditioner is turned OFF");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Air Conditioner temperature set to " + temperature + " degrees");
    }

}
