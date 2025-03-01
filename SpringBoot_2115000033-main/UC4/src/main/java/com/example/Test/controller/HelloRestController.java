package com.example.Test.controller;


import org.springframework.web.bind.annotation .*;
import com.example.Test.model.User;

@RestController
@RequestMapping("/hello")
public class HelloRestController {
    @PostMapping("/post")
    public String sayHelloPost(@RequestBody User user){
        return "Hello " + user.getFirstName()+" "+user.getLastName()+" from Bridgelabz";
    }

}