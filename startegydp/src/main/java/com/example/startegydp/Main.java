package com.example.startegydp;

import com.example.startegydp.models.Device;
import com.example.startegydp.models.Phone;
import com.example.startegydp.models.PhonePlayer;
import com.example.startegydp.models.Resol1080p;
import com.example.startegydp.models.Resol480p;
import com.example.startegydp.models.Resolution;
import com.example.startegydp.models.Tv;
import com.example.startegydp.models.TvVideoPlayer;
import com.example.startegydp.models.VideoPlayer;

public class Main {
    public static void main(String[] args) {
        Resolution highResolution = new Resol1080p();
        Device phone = new Phone();
        Resolution lowResolution = new Resol480p();
        Device tv = new Tv();
        VideoPlayer videoPlayer1 = new PhonePlayer(phone, lowResolution);
        videoPlayer1.display();
        VideoPlayer videoPlayer2 = new TvVideoPlayer(tv, highResolution);
        videoPlayer2.display();
    }
}