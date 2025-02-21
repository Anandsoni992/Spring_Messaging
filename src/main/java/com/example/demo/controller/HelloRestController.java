package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

    private static final Logger logger = LoggerFactory.getLogger(HelloRestController.class);

    @GetMapping
    public String getHello() {
        logger.info("Received GET request");
        return "Hello from BridgeLabz!";
    }

    @PostMapping
    public String postHello() {
        logger.info("Received POST request");
        return "Hello from BridgeLabz! (POST)";
    }

    @PutMapping
    public String putHello() {
        logger.info("Received PUT request");
        return "Hello from BridgeLabz! (PUT)";
    }
    
    @DeleteMapping
    public String deleteHello() {
        logger.info("Received DELETE request");
        return "Hello from BridgeLabz! (DELETE)";
    }
}
