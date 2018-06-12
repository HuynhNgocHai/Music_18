package com.framgia.music_18.screen.offline;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.pc.music_18.R;

public class OfflineFragment extends Fragment  {

    public OfflineFragment(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_offline, container, false);

        return view;
    }
}
