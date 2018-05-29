package com.example.apple.videoapptutorial;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    private VideoView videoView;

    private MediaController mediaController;
    private Button button;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoView =  findViewById(R.id.videoView);
        button = findViewById(R.id.button);
        mediaController = new MediaController(this);
        videoPlay();




    }
    public  void videoPlay(){
        String videopath = "android.resource://com.example.apple.videoapptutorial/"+R.raw.login_user1111;
        Uri uri = Uri.parse(videopath);
        videoView.setVideoURI(uri);

        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
        videoView.start();
    }




}

