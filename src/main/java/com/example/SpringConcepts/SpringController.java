package com.example.SpringConcepts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class SpringController {

    @GetMapping
    public String UC1() {
        return "Hello from BridgeLabz";
    }
}
