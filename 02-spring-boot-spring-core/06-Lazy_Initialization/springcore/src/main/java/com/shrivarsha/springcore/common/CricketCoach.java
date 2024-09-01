package com.shrivarsha.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach  implements  Coach{


    public CricketCoach()
    {
        System.out.println("Cricket Constructor");
    }
    @Override
    public String getDailyWorkout() {
        return "Practice bowling";
    }
}
