package com.example.adapterdp.models;

public class MediaPlayerAdapter implements MediaPlayer {
    AdvanceMediaPlayer advanceMediaPlayer;
    AdvanceFormat advanceFormat;

    public MediaPlayerAdapter(AdvanceFormat advanceFormat) {
        advanceMediaPlayer = new AVIPlayer();
        this.advanceFormat = advanceFormat;
    }

    @Override
    public void play(String fileName, String fileType) {
        advanceFormat.setFileToPlay(fileName);
        advanceFormat.setFileTypeToPlay(fileType);
        advanceMediaPlayer.playAdvanceFormat(advanceFormat);
    }

}
