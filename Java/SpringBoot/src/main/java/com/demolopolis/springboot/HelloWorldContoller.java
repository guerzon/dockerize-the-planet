package com.demolopolis.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldContoller {

    @GetMapping("/")
    public String index() {
        return "Hello from spring!";
    }
}
