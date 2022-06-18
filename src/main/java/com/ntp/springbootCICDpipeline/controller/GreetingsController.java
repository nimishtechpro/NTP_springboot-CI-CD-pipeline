package com.ntp.springbootCICDpipeline.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @GetMapping("/")
    public String hello(){

        return "Greeting from Webapp !";
    }
}
