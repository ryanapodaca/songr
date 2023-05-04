package com.spacesongr.songr.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String title;
    String artist;
    Integer songCount;
    Integer lengthSeconds;
    String imageURL;

    @OneToMany(mappedBy = "album", cascade = CascadeType.ALL)
    List<Song> songs;

    protected Album() {}

    public Album(long id, String title, String artist, Integer songCount, Integer lengthSeconds, String imageURL) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.lengthSeconds = lengthSeconds;
        this.imageURL = imageURL;
    }

    public Album(String title, String artist, Integer songCount, Integer lengthSeconds, String imageURL) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.lengthSeconds = lengthSeconds;
        this.imageURL = imageURL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getSongCount() {
        return songCount;
    }

    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    public int getLengthSeconds() {
        return lengthSeconds;
    }

    public void setLengthSeconds(int lengthSeconds) {
        this.lengthSeconds = lengthSeconds;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
}
