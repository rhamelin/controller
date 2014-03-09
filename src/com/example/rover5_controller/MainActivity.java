package com.example.rover5_controller;
 
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
 
public class MainActivity extends Activity {
	VideoView myVideoView;
	ProgressDialog progDialog;
	AudioManager audio;
	MediaController mediaController;
	String unStringUrl="rtsp://192.168.1.130:8554/test";
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the layout from video_main.xml
        setContentView(R.layout.activity_main);
 
        myVideoView = (VideoView)findViewById(R.id.videoView1);
        progDialog = ProgressDialog.show(MainActivity.this,  null,  "Video Loading...", true);
        audio = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
        
        mediaController = new MediaController(this);
        myVideoView.setMediaController(mediaController);
        myVideoView.setVideoURI(Uri.parse(unStringUrl));
        myVideoView.requestFocus();
        
        
      
    }
 
}