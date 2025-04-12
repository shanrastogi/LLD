package com.example.startegydp.models;

public abstract class VideoPlayer {
    Device currentDevice;
    Resolution currentResolution;

    void getDevice() {
        currentDevice.Device();
    }

    void getResolution() {
        currentResolution.Resolution();
    }

    public abstract void display();
}
