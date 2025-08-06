package com.luv2code.springboot.demo.mycoolapp.rest;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

//    expose "/" that return "Hello World"

    @GetMapping("/")
    public String sayHello() {
        return "Hello World!";
    }

    //expose a new endpoint

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5km";
    }

    //expose a new endpoint for "fortune"

    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day";
    }
}

