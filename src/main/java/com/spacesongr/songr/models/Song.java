package com.spacesongr.songr.models;

import jakarta.persistence.*;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String title;
    Integer lengthSeconds;
    Integer trackNumber;
    @ManyToOne
    Album album;

    public Song() {}

    public Song(long id, String title, Integer lengthSeconds, Integer trackNumber, Album album) {
        this.id = id;
        this.title = title;
        this.lengthSeconds = lengthSeconds;
        this.trackNumber = trackNumber;
        this.album = album;
    }

    public Song(String title, Integer lengthSeconds, Integer trackNumber, Album album) {
        this.title = title;
        this.lengthSeconds = lengthSeconds;
        this.trackNumber = trackNumber;
        this.album = album;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLengthSeconds() {
        return lengthSeconds;
    }

    public void setLengthSeconds(int lengthSeconds) {
        this.lengthSeconds = lengthSeconds;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", lengthSeconds=" + lengthSeconds +
                ", trackNumber=" + trackNumber +
                ", album=" + album +
                '}';
    }
}
