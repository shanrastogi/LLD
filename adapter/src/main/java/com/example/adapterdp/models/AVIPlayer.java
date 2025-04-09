package com.example.adapterdp.models;

public class AVIPlayer implements AdvanceMediaPlayer {
    @Override
    public void playAdvanceFormat(AdvanceFormat advanceFormat) {
        System.out.println("Playing AVI file. Name: " + advanceFormat.getFileToPlay() +
                ", Type: " + advanceFormat.getFileTypeToPlay() + ", Resolution: " + advanceFormat.getResolution());
    }
}
