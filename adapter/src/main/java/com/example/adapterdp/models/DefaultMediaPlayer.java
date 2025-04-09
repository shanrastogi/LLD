package com.example.adapterdp.models;

public class DefaultMediaPlayer implements MediaPlayer {
    @Override
    public void play(String fileName, String fileType) {
        System.out.println("Playing " + fileType + " file. Name: " + fileName);
    }

}
