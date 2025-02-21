package com.example.demo.controller;
import org.springframework.web.bind.annotation.*;
import com.example.demo.model.*;
@RestController
@RequestMapping("/hello")
public class HelloController {

    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz!";
    }
}
