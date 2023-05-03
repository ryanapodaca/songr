package com.spacesongr.songr;

import com.spacesongr.songr.Repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class Controller {
    @Autowired
    AlbumRepository AlbumRepository;

    @GetMapping("/hello")
    public String getGreeting(){
        return "./resources/templates/hello_world.html";
    }

    @GetMapping("/capitalize/{capitalize}")
    public String getcapitalizedTerm(Model m, @PathVariable String toCapitalize){
        String capitalized = toCapitalize.toUpperCase();
        m.addAttribute("capitalize", capitalized);
        return "./resources/templates/capitalize.html";
    }

    @GetMapping("/")
    public String getsSplashAlbums(Model m) {
        List<Album> albums = AlbumRepository.findAll();
        m.addAttribute("Albums", albums);



        return ".html";
    }
    @PostMapping("/albums")
    public String getAlbums(Model m){
        ArrayList<Album> list = new ArrayList<>();
//        Album album1 = new Album("Room for Squares", "John Mayer");
//        Album album2 = new Album("Try", "John Mayer");
//        Album album3 = new Album("Continuum", "John Mayer");
//        list.add(album1);
//        list.add(album2);
//        list.add(album3);
        m.addAttribute("albumList", list);
        return "./resources/templates/albums.html";
    }
}
