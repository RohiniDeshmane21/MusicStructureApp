package com.example.android.musicstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button play;
    TextView artist;
    TextView playlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play = (Button)findViewById(R.id.btnPlay);
        artist = (TextView)findViewById(R.id.textViewArtist);
        playlist = (TextView)findViewById(R.id.textViewPlayList);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songList = new Intent(MainActivity.this,SongsList.class);
                startActivity(songList);
            }
        });

        artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songList = new Intent(MainActivity.this,Artist.class);
                startActivity(songList);
            }
        });

        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songList = new Intent(MainActivity.this,Playlist.class);
                startActivity(songList);
            }
        });
    }
}
