package com.dunky.api.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {
    // Expose "/" endpoint that returns "Hello World!"
    @GetMapping ("/")
    public String sayHello(){
        return "Hello World! Time on the server is: " + LocalDateTime.now();
    }

    // Expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 10K";
    }
}
