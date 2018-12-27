package com.example.android.musicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ClassicActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classic);

        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("I wish ", "One Direction", "3:50"));
        songs.add(new Song("Circus", "Britney Spears", "3:50"));
        songs.add(new Song("I.O.U", "Victoria Beckham", "3:50"));
        songs.add(new Song("Poker Face", "Lady Gaga", "3:50"));
        songs.add(new Song("Photograph", "Ed Sheeran", "3:50"));
        songs.add(new Song("StickWitU", "Pussycat Dolls", "3:50"));
        songs.add(new Song("As Long as You Love Me", "Backstreet Boys", "3:50"));
        songs.add(new Song("Total Eclipse of the Heart","Westlife", "3:50"));


        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
