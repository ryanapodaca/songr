package com.spacesongr.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;

@Controller
public class Controllers {
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

    @GetMapping("/albums")
    public ArrayList<Album> getAlbums(){
        ArrayList<Album> list = new ArrayList<>();
        Album album1 = new Album("Room for Squares", "John Mayer");
        Album album2 = new Album("Try", "John Mayer");
        Album album3 = new Album("Continuum", "John Mayer");
        list.add(album1);
        list.add(album2);
        list.add(album3);
        return list;
    }
}
