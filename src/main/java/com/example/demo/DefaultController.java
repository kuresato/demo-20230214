package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class DefaultController {
    @GetMapping(value="/")
    public Message index() {
        String name = "your name";
        return new Message(1, "Hello " + name);
    }

}
