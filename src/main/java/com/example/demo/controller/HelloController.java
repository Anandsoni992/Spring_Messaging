package com.example.demo.controller;

import com.example.demo.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    // UC1: Basic GET Request
    @GetMapping
    public String sayHello() {
        logger.info("GET /hello called");
        return "Hello From BridgeLabz!!!";
    }

    // UC2: GET Request with Query Parameter
    @GetMapping("/query")
    public String sayHelloQuery(@RequestParam(value = "name") String name) {
        logger.info("GET /hello/query called with name: {}", name);
        return "Hello " + name + " from BridgeLabz!";
    }

    // UC3: GET Request with Path Variable
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        logger.info("GET /hello/param/{} called", name);
        return "Hello " + name + " from BridgeLabz!";
    }

    // UC4: POST Request with JSON Body
    @PostMapping("/post")
    public String sayHelloPost(@RequestBody User user) {
        logger.info("POST /hello/post called with user: {} {}", user.getFirstName(), user.getLastName());
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz!";
    }

    // UC5: PUT Request with Path Variable & Query Parameter
    @PutMapping("/put/{firstName}")
    public String sayHelloPut(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) {
        logger.info("PUT /hello/put/{}?lastName={} called", firstName, lastName);
        return "Hello " + firstName + " " + lastName + " from BridgeLabz!";
    }

}
