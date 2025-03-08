package com.sks.code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // inject properties
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    // expose new endpoint for team info

    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Coach : "+ coachName + "  Team Name : "+teamName;
    }


    //expose "/" that return Hello World
    @GetMapping("/")
    public String sayHello() {
        return "Hello Spring World !";
    }

    //expose new end point  for workout
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "run a hard 5 KM";
    }

    @GetMapping("/fortune")
    public String getFortune() {
        return "Today is beautiful day";
    }
}
