package com.example.springPro1.employee.controller;

import com.example.springPro1.employee.dto.EmployeeDto;
import com.example.springPro1.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @PostMapping("saveEmployee3")
    public ResponseEntity<?>saveEmployee(@RequestBody  EmployeeDto employeeDto){
        return employeeService.saveEmployee(employeeDto);
    }


}
