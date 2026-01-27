package com.example.bookmyplan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class visa {

    @GetMapping("/visa")
    public String getData() {
        return "Hello Welcome to BookMyPlan, Please book hotel tickets at 10% discount.";
    }
}
