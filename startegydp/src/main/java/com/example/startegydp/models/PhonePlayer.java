package com.example.startegydp.models;

public class PhonePlayer extends VideoPlayer {
    public PhonePlayer(Device device, Resolution resolution) {
        this.currentDevice = device;
        this.currentResolution = resolution;
    }

    @Override
    public void display() {
        this.getDevice();
        this.getResolution();
    }

}
