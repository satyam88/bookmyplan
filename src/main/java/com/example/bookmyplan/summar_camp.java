package com.example.bookmyplan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class summar_camp {

    @GetMapping("/summar_camp")
    public String getData() {
        return "Hello Welcome to BookMyPlan, Please book flight tickets at 20% discount";
    }
}
