package com.spacesongr.songr.controllers;

import com.spacesongr.songr.models.Album;
import com.spacesongr.songr.Repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class AlbumController {
    @Autowired
    AlbumRepository AlbumRepository;

    @GetMapping("/hello")
    public String getGreeting(){
        return "hello_world.html";
    }

    @GetMapping("/capitalize/{capitalize}")
    public String getcapitalizedTerm(Model m, @PathVariable String capitalize){
        String capitalized = capitalize.toUpperCase();
        m.addAttribute("capitalize", capitalized);
        return "./resources/templates/capitalize.html";
    }

    @GetMapping("/")
    public String getsSplashAlbums(Model m) {
        List<Album> albums = AlbumRepository.findAll();
        m.addAttribute("Albums", albums);
        return "albums.html";
    }

    @GetMapping("/album/{album}")
    public String getAlbumInfo(Model m, @PathVariable Album album){
        m.addAttribute("album", album);
        return "/singleAlbum.html";
    }


    @PostMapping("/album/update")
    public RedirectView updateAlbum(Long id, String title, String artist, Integer songCount, Integer length, String imageUrl){
        Album updatedAlbum = new Album (id, title, artist,songCount, length, imageUrl);
        AlbumRepository.save(updatedAlbum);
        return new RedirectView("/");
    }

    @PostMapping("/album/add")
    public RedirectView addAlbumFromForm(String title, String artist, Integer songCount, Integer length, String imageUrl){
        Album newAlbum = new Album(title, artist, songCount, length, imageUrl);
        AlbumRepository.save(newAlbum);
        return new RedirectView("/");
    }
}
