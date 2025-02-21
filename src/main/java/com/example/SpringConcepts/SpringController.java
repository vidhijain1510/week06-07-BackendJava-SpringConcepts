package com.example.SpringConcepts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/hello")
public class SpringController {

    @GetMapping
    public String UC1() {
        return "Hello from BridgeLabz";
    }

    //Correct SLF4J Logger
    private static final Logger logger = LoggerFactory.getLogger(SpringController.class);

    @GetMapping("/uc2")
    public String UC2() {
        logger.info("GET request received at /hello/uc2");
        return "Hello from BridgeLabz with Logging";
    }

    //UC3
    private final EmployeeBean employee;

    public SpringController(EmployeeBean employee) {
        this.employee = employee;
    }

    @GetMapping("/details")
    public String getEmployeeDetails() {
        return employee.getEmployeeDetails();
    }
}
