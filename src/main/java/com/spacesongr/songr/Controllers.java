package com.spacesongr.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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
}
