package com.example.springPro1.employee.service;

import com.example.springPro1.employee.dto.EmployeeDto;
import org.springframework.http.ResponseEntity;

public interface EmployeeService {

    ResponseEntity<?>saveEmployee(EmployeeDto employeeDto);
}
