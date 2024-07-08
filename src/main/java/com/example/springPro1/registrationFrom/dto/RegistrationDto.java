package com.example.springPro1.registrationFrom.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;
@Getter
@Setter
public class RegistrationDto {

    private String name;

    private  String middleName;

    private String lastName;

    private LocalDate age;

    private  Long aadharCardNo;

    private String department;

    private  String address;
}
