package com.amazon0;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Moe {


    @GetMapping("hi")
    public String Hi(){
        String hi = "Hi, Mohammad Abdelmohsen was here.";

        return hi;

    }
}