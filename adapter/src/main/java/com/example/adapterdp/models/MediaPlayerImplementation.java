package com.example.adapterdp.models;

public class MediaPlayerImplementation  implements MediaPlayer{
    MediaPlayerAdapter mediaPlayerAdapter;
    MediaPlayer mediaPlayer;

    @Override
    public void play(String fileName, String fileType){
        if(fileType.equals(("mp3"))){
            mediaPlayer = new DefaultMediaPlayer();
            mediaPlayer.play(fileName, fileType);
        } else {
            AdvanceFormat advanceFormat = new AdvanceFormat();
            advanceFormat.setResolution("720p");
            mediaPlayerAdapter = new MediaPlayerAdapter(advanceFormat);
            mediaPlayerAdapter.play(fileName, fileType);
        }
    }
}
