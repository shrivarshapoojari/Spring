package com.luv2code.springboot.demo.mycoolapp.rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

   // inject properties from application properties
    @Value("${coach.name}")
    private String coachName;

    @Value(("${team.name}"))
    private String teamName;
    //expose "/" that return  "Hello World"

// new endpoint for teaminfo

    @GetMapping("/teaminfo")
    public  String getTeamInfo(){
        return "Coach" +coachName + "teamname" +teamName;
    }

    @GetMapping("/")
    public  String sayHello()
    {
        return  "Hello World";
    }

    @GetMapping("/workout")
    public String getDailyWorkout()
    {
        return "Working";
    }

}
