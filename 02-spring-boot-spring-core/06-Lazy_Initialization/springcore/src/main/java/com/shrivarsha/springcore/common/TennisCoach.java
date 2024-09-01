package com.shrivarsha.springcore.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TennisCoach implements Coach {

    public TennisCoach()
    {
        System.out.println("BaseBall Constructor");
    }
    @Override
    public  String getDailyWorkout()
    {
        return "Tennis ball practice";
    }

}
