package com.vehicleManagement.VehicalManagement.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MyApiController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Muski!";
    }
}
