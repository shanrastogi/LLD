package com.example.startegydp.models;

public class TvVideoPlayer extends VideoPlayer {
    public TvVideoPlayer(Device device, Resolution resolution) {
        this.currentDevice = device;
        this.currentResolution = resolution;
    }

    @Override
    public void display() {
        this.getDevice();
        this.getResolution();
    }
}
