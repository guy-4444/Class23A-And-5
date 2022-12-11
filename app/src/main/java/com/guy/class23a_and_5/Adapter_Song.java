package com.guy.class23a_and_5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.textview.MaterialTextView;

import java.util.ArrayList;

public class Adapter_Song extends RecyclerView.Adapter<Adapter_Song.SongViewHolder> {

    private ArrayList<Song> songs;

    public Adapter_Song(ArrayList<Song> songs) {
        this.songs = songs;
    }

    @Override
    public int getItemCount() {
        return songs == null ? 0 : songs.size();
    }

    @Override
    public SongViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_song, parent, false);
        SongViewHolder mySongViewHolder = new SongViewHolder(view);
        return mySongViewHolder;
    }

    @Override
    public void onBindViewHolder(final SongViewHolder holder, final int position) {
        Song song = songs.get(position);

        holder.song_LBL_name.setText(song.getName());
        holder.song_LBL_duration.setText( MyStringUtils.getTimeBySeconds(song.getDuration()));


    }

    class SongViewHolder extends RecyclerView.ViewHolder {

        private MaterialTextView song_LBL_likes;
        private MaterialTextView song_LBL_views;
        private MaterialTextView song_LBL_duration;
        private MaterialTextView song_LBL_name;
        private AppCompatImageView song_IMG_image;

        public SongViewHolder(View itemView) {
            super(itemView);
            song_LBL_likes = itemView.findViewById(R.id.song_LBL_likes);
            song_LBL_views = itemView.findViewById(R.id.song_LBL_views);
            song_LBL_duration = itemView.findViewById(R.id.song_LBL_duration);
            song_LBL_name = itemView.findViewById(R.id.song_LBL_name);
            song_IMG_image = itemView.findViewById(R.id.song_IMG_image);

        }

    }
}
