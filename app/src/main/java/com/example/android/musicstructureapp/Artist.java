package com.example.android.musicstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Artist extends AppCompatActivity {

    TextView activityInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);
        /*
        set title show use of activity
         */
        activityInfo = (TextView)findViewById(R.id.textViewScreenInfo);
        activityInfo.setText("Songs list depends on Artist");
    }
}
