package com.sks.code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

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
