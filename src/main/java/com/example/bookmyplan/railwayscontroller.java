package com.example.bookmyplan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class railwayscontroller {

    @GetMapping("/railways")
    public String getIndianRailways() {
        return "Hello Welcome to BookMyPlan, Please book Indian Railways tickets at 60% discount";
    }

    @GetMapping("/local-railways")
    public String getLocalRailways() {
        return "Hello Welcome to BookMyPlan, Please book local railways tickets at 30% discount";
    }
}
