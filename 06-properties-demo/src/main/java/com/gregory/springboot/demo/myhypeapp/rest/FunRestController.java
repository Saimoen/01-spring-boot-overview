package com.gregory.springboot.demo.myhypeapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // inject properties for: coach.name and team.name
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    // expose new endpoint for "teaminfo"
    @GetMapping("/team")
    public String teamInfo() {
        return coachName + teamName;
    }

    // expose "/" that return "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World !";
    }

    // expose "/workout" that return "Let's get it !"
    @GetMapping("/workout")
    public String doYourself() {
        return "Lett'sss get it !";
    }

}
