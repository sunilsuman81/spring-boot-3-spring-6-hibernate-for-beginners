package com.sks.springcoredemo.common;

public class SwimCoach implements Coach{


    public SwimCoach(){
        System.out.println("In Constructor : "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "swim 1000 meters as a warm type";
    }
}
