package com.framgia.music_18.screen.song;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.pc.music_18.R;
import com.framgia.music_18.screen.BaseFragment;


public class SongFragment extends BaseFragment {

    public SongFragment(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_song, container, false);

        return view;
    }
}
