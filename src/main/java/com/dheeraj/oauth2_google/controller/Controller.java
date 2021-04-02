package com.dheeraj.oauth2_google.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String helloworld()
    {
        return "hello world";
    }

    @GetMapping("/restricted")
    public String restricted()
    {
        return "to see this text , you have to be logged in";
    }
}
