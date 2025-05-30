package com.mvc.security.MVC.Security.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/")
    public String showHome() {

        return "home";
    }



    @GetMapping("/leaders")
    public String showLeaders() {

        return "leaders";
    }
    @GetMapping("/systems")
    public String showSystemInfo() {

        return "systems";
    }
    @GetMapping("/access-denied")
    public String acessdenied() {

        return "access-denied";
    }

}