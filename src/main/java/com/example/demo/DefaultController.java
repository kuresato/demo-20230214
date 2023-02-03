package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class DefaultController {
    @GetMapping(value="/")
    public Message index() {
        return new Message(1, "Hello World.");
    }
   
}
