package com.example.android.musicstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SongsList extends AppCompatActivity {

    TextView activityInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs_list);
        /*
        set title show use of activity
         */
        activityInfo = (TextView)findViewById(R.id.textViewScreenInfo);
        activityInfo.setText("Shows played song name with others songs list and add to favourite button");
    }
}
