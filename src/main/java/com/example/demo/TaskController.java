package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class TaskController {


    @GetMapping()
    public String getHello() {
        return "Hello, world!";
    }

}
