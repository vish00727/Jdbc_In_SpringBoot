package com.example.springPro1.employee.ServiceImpl;


import com.example.springPro1.api.ApiResponse;
import com.example.springPro1.employee.dto.EmployeeDto;
import com.example.springPro1.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public ResponseEntity<?> saveEmployee(EmployeeDto employeeDto) {
        var response = new ApiResponse<>();
        String insert = "INSERT INTO Employee (name, lastname) VALUES (?, ?)";

        jdbcTemplate.update(con -> {
            PreparedStatement pst = con.prepareStatement(insert);
            pst.setString(1, employeeDto.getName());
            pst.setString(2, employeeDto.getLastName());
            return pst;
        });

        response.setStatusCode(HttpStatus.OK.value());
        response.setMessage("Data has been entered");
        return ResponseEntity.ok(response);
    }
}
