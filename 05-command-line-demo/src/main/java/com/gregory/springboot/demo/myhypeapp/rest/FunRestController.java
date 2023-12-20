package com.gregory.springboot.demo.myhypeapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
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
