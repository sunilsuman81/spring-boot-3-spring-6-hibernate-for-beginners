package com.sks.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{

    public TrackCoach() {
        System.out.println("In Constructor "+ getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice warm up before run";
    }
}
