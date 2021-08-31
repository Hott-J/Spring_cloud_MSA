package com.example.firstservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// http://localhost:8081/welcome
@RestController
@RequestMapping("/first-service/")
public class FirstServiceController {
    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to the First Service.";
    }
}