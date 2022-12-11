package com.guy.class23a_and_5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private RecyclerView main_LST_songs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_LST_songs = findViewById(R.id.main_LST_songs);


        ArrayList<Song> songs = DataManager.getSongs();
        Adapter_Song adapter_song = new Adapter_Song(songs);
        main_LST_songs.setLayoutManager(new LinearLayoutManager(this));
        main_LST_songs.setAdapter(adapter_song);
    }
}