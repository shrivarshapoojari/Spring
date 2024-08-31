package com.shrivarsha.springcore;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach  implements  Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice bowling";
    }
}
