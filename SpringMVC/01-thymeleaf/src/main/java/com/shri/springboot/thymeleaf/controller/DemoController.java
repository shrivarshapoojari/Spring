package com.shri.springboot.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/get")
    public String sayHello(Model theModel) {
        theModel.addAttribute("theData", java.time.LocalDateTime.now());
        return "helloworld"; // Ensure you have a helloworld.html template in /templates
    }
}
