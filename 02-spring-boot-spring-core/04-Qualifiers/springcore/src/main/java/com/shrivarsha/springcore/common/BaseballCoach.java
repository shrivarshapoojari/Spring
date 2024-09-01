package com.shrivarsha.springcore.common;


import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements  Coach{
    @Override
    public  String getDailyWorkout()
    {
        return "Baseball practice";
    }
}
