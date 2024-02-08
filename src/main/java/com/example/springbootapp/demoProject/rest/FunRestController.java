package com.example.springbootapp.demoProject.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // Injecting properties from application.properties by the fields coach.name and team.name
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    // Exposing new endpoint for teamInfo
    @GetMapping("/teamInfo")
    public String getTeamInfo() {
        return "Coach: " + coachName +", Team: "+ teamName;
    }
    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 5k!";
    }
    @GetMapping("/play")
    public String getPlay(){
        return "Let's play";
    }
}
