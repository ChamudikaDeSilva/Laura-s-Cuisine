package com.example.chamudika.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // Add this annotation
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index"; // returns the index.html page
    }

    @GetMapping("/about")
    public String about() {
        return "about"; // returns the about.html page
    }

    @GetMapping("/chef")
    public String chef() {
        return "chef"; // returns the chef.html page
    }

    @GetMapping("/menu")
    public String menu() {
        return "menu"; // returns the menu.html page
    }

    @GetMapping("/reservation")
    public String reservation() {
        return "reservation"; // returns the reservation.html page
    }

    @GetMapping("/blog")
    public String blog() {
        return "blog"; // returns the blog.html page
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact"; // returns the contact.html page
    }
}
