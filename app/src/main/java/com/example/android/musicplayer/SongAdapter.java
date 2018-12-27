package com.example.android.musicplayer;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> songs){
        super(context, 0 , songs);
    }
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Song currWord = getItem(position);

        TextView songName = (TextView) listItemView.findViewById(R.id.song_text_view);
        songName.setText(currWord.getSongName());

        TextView songArtist = (TextView) listItemView.findViewById(R.id.artist_text_view);
        songArtist.setText(currWord.getSongArtist());
        //return super.getView(position, convertView, parent);

        return listItemView;
    }
}


