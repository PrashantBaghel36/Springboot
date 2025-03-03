package com.example.FirstProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController2 {

    // Use @PathVariable to extract the path variable 'name' from the URL
    @GetMapping("/hello/param/{name}")
    public String hello(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}
