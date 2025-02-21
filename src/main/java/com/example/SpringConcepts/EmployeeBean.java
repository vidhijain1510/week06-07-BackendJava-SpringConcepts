package com.example.SpringConcepts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
    private String name = "Vidhi Jain";

    @Autowired
    private DepartmentBean department;

    public String getEmployeeDetails() {
        return "Employee Name: " + name + ", Department: " + department.getDepartmentName();
    }
}


