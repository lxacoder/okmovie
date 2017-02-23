package lxacoder.okmovie.view.news.impl;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import lxacoder.okmovie.R;


public class VideoDetailActivity extends AppCompatActivity {

    VideoView mVideoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_detail);
        mVideoView = (VideoView)findViewById(R.id.vv);
        Intent intent = getIntent();
        String uriIntent = intent.getStringExtra("videoUri");
        Uri uri = Uri.parse(uriIntent);
        mVideoView.setVideoURI(uri);
        mVideoView.setMediaController(new MediaController(this));
        mVideoView.start();
    }
}
