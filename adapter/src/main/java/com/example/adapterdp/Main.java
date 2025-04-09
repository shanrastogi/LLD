package com.example.adapterdp;

import com.example.adapterdp.models.MediaPlayer;
import com.example.adapterdp.models.MediaPlayerImplementation;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MediaPlayer mediaPlayer = new MediaPlayerImplementation();
        mediaPlayer.play("HelloSong", "mp3");
        mediaPlayer.play("HelloSonginNewFormat", "mp4");
    }
}