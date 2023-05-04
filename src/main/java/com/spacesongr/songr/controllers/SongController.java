package com.spacesongr.songr.controllers;

import com.spacesongr.songr.Repository.AlbumRepository;
import com.spacesongr.songr.Repository.SongRepository;
import com.spacesongr.songr.models.Album;
import com.spacesongr.songr.models.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SongController {
    @Autowired
    SongRepository songRepository;
    @Autowired
    AlbumRepository albumRepository;

//    @PostMapping("/song/add")
//    public RedirectView addSong(String title, Integer length, Integer trackNumber, String AlbumTitle) {
//        Album album;
//
//        if (AlbumRepository.findByTitle(AlbumTitle) != null)
//            album = AlbumRepository.findByTitle(AlbumTitle);
//        else
//            throw new IllegalArgumentException("Could not find album for song in db");
//
//        Song song = new Song(title, length, trackNumber, album);
//        SongRepository.save(song);
//        return new RedirectView("/");
//    }

}
