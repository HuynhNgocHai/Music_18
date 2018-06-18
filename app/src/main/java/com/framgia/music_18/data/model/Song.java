package com.framgia.music_18.data.model;

import android.support.annotation.NonNull;
import android.widget.ImageView;

public class Song implements Comparable<Song> {

    private long mId;
    private String mTitle;
    private String mArtist;
    private String mArtworkUrl;
    private long mDuration;
    private String mStreamUrl;
    private int mPlaybackCount;

    public Song(long id, String title, String artist, String artworkUrl, long duration, String streamUrl, int playbackCount) {
        mId = id;
        mTitle = title;
        mArtist = artist;
        mArtworkUrl = artworkUrl;
        mDuration = duration;
        mStreamUrl = streamUrl;
        mPlaybackCount = playbackCount;
    }

    public long getId() {
        return mId;
    }

    public void setId(long id) {
        mId = id;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getArtist() {
        return mArtist;
    }

    public void setArtist(String artist) {
        mArtist = artist;
    }

    public String getArtworkUrl() {
        return mArtworkUrl;
    }

    public void setArtworkUrl(String artworkUrl) {
        mArtworkUrl = artworkUrl;
    }

    public long getDuration() {
        return mDuration;
    }

    public void setDuration(long duration) {
        mDuration = duration;
    }

    public String getStreamUrl() {
        return mStreamUrl;
    }

    public void setStreamUrl(String streamUrl) {
        mStreamUrl = streamUrl;
    }

    public int getPlaybackCount() {
        return mPlaybackCount;
    }

    public void setPlaybackCount(int playbackCount) {
        mPlaybackCount = playbackCount;
    }

    @Override
    public int compareTo(@NonNull Song another) {
        return another.mPlaybackCount - this.mPlaybackCount;
    }
}
