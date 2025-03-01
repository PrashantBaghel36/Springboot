package com.example.FirstProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class Hello {
    @GetMapping("/abh")
    public String print(){
        return "Hello!! Froom the BridgeLabzz" ;
    }
}
