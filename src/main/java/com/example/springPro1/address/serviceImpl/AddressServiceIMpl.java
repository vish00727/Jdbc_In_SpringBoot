package com.example.springPro1.address.serviceImpl;

import com.example.springPro1.address.dto.AddressDto;
import com.example.springPro1.address.service.AddressService;
import com.example.springPro1.api.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.PreparedStatement;

@Service
public class AddressServiceIMpl implements AddressService {

@Autowired
private JdbcTemplate jdbcTemplate;
    @Override
    public ResponseEntity<?> saveAddress(AddressDto addressDto) {
        var response= new ApiResponse<>();
        String sql="insert into Address (" +
                "flatno," +
                "laneNo," +
                "pincode," +
                "isdelete )" +
                "values" +
                "(?,?,?,?)";

          jdbcTemplate.update(connection -> {
              PreparedStatement pst= connection.prepareStatement(sql);
              pst.setInt(1,addressDto.getFlatNo());
              pst.setInt(2,addressDto.getPincode());
              pst.setInt(3,addressDto.getLaneNo());
              pst.setBoolean(4,addressDto.getIsdelete());
            return  pst;
          });


          response.setMessage("data entered successfully");
          response.setStatusCode(HttpStatus.OK.value());
          return ResponseEntity.ok(response);
    }
}
