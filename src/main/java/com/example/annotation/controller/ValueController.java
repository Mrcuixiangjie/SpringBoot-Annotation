package com.example.annotation.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValueController {
    @Value("${xaut.name}")
    private String schoolName;
    @RequestMapping("/val")
    public String getValue(){
        return schoolName;
    }
}
