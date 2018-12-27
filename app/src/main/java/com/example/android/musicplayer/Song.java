package com.example.android.musicplayer;

public class Song {
    private String mSongName;
    private String mSongArtist;
    private String mSongLength;

    public Song(String songName, String songArtist, String songLength){
        mSongName = songName;
        mSongArtist = songArtist;
        mSongLength = songLength;
    }

    public String getSongName(){
        return mSongName;

    };
    public String getSongArtist(){
        return mSongArtist;
    };

    public String getSongLength(){
        return mSongLength;
    }
}
