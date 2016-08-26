package com.example.android.musicstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Playlist extends AppCompatActivity {

    TextView activityInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);
        /*
        set title show use of activity
         */
        activityInfo = (TextView)findViewById(R.id.textViewScreenInfo);
        activityInfo.setText("Shows created play list or default play lists");
    }
}
