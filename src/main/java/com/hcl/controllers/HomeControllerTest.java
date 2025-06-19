package com.hcl.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody; // Import this

@Controller
@RequestMapping("/")
public class HomeControllerTest {

    @GetMapping
    @ResponseBody // This tells Spring to return the string directly as response body
    public String home() {
        return "Hello from Payment System!"; // Just a simple string
    }
   }