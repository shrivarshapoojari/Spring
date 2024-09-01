package com.shrivarsha.springcore.common;


import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements  Coach{
    public BaseballCoach()
    {
        System.out.println("BaseBall Constructor");
    }
    @Override
    public  String getDailyWorkout()
    {
        return "Baseball practice";
    }
}
