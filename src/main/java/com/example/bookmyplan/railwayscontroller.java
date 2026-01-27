package com.example.bookmyplan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class railwayscontroller {

    @GetMapping("/one-railways")
    public String getIndianRailways() {
        return "Hello Welcome to BookMyPlan, Please book Indian dddddddd tickets at 60% discount";
    }

    @GetMapping("/superfast-railways")
    public String getLocalRailways() {
        return "Hello Welcome to BookMyPlan, Please book ddddddd railways tickets at 30% discount";

    @GetMapping("/pre-railways")
    public String getLocalRailways() {
        return "Hello Welcome to BookMyPlan, sddsd book pre railways tickets at 30% discount";
        
    }

    @GetMapping("/goods-railways")
    public String getIocalRailways() {
        return "Hello Welcome to BookMyPlan, Please book goods ddddddddd tickets at 30% discount";
    }
}
