package com.framgia.music_18.screen.song;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import com.framgia.music_18.screen.artist.ArtistFragment;
import com.framgia.music_18.screen.genres.GenresFragment;
import com.framgia.music_18.screen.offline.OfflineFragment;
import com.framgia.music_18.screen.song.SongFragment;

public class PagerAdapter extends FragmentStatePagerAdapter {
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment frag = null;
        switch (position){
            case 0:
                frag = new SongFragment();
                break;
            case 1:
                frag = new GenresFragment();
                break;
            case 2:
                frag = new ArtistFragment();
                break;
            case 3:
                frag = new OfflineFragment();
                break;
        }
        return frag;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){
            case 0:
                title="Song";
                break;
            case 1:
                title="Genres";
                break;
            case 2:
                title="Artist";
                break;
            case 3:
                title="Offline";
                break;
        }

        return title;
    }
}
