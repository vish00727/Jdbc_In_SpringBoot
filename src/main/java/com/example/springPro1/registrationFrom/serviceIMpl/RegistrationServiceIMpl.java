package com.example.springPro1.registrationFrom.serviceIMpl;

import com.example.springPro1.api.ApiResponse;
import com.example.springPro1.registrationFrom.dto.RegistrationDto;
import com.example.springPro1.registrationFrom.service.RegistrationFromService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Service;

import javax.swing.tree.RowMapper;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Types;
import java.util.List;
import java.util.Map;

@Service
public class RegistrationServiceIMpl implements RegistrationFromService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public ResponseEntity<?> saveRegistration(RegistrationDto registrationDto) {
        var response = new ApiResponse<>();
        String sql = "INSERT INTO registrationform (" +
                "name, middlename, lastname, age, aadharcardno, department, address) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?)";

        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(con -> {
            PreparedStatement pst = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, registrationDto.getName());
            pst.setString(2, registrationDto.getMiddleName());
            pst.setString(3, registrationDto.getLastName());
            pst.setDate(4, Date.valueOf(registrationDto.getAge()));
            pst.setLong(5, registrationDto.getAadharCardNo());
            pst.setString(6, registrationDto.getDepartment());
            pst.setString(7, registrationDto.getAddress());
            return pst;
        }, keyHolder);



        response.setStatusCode(HttpStatus.OK.value());
        response.setMessage("data has been entered");
        return ResponseEntity.ok(response);

    }

    @Override
    public ResponseEntity<?> getRegistartion(Long id) {
        var response= new ApiResponse<>();
        String querySql="  select * from getRegistrationid(?)";
        List<Map<String, Object>> list= jdbcTemplate.queryForList(querySql, id);
        response.setResult(list);
        return ResponseEntity.ok(response);
    }
}

