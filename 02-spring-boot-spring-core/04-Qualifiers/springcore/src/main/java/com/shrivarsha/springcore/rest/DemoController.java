package com.shrivarsha.springcore.rest;

import com.shrivarsha.springcore.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;

   @Autowired
   public void DemoController(@Qualifier("baseballCoach") Coach theCoach)
   {
       myCoach=theCoach;  
   }
    @GetMapping("/workout")
    public String workout()
    {
        return  myCoach.getDailyWorkout();
    }
}
