package com.sks.springcoredemo.rest;

import com.sks.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //define private field
    private Coach myCoach;

    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach coach){
        System.out.println("In Constructor "+ getClass().getSimpleName());
        myCoach = coach;

    }

    @GetMapping("/dailyWorkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }


}
