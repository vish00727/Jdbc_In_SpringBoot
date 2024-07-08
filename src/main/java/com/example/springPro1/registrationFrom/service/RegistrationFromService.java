package com.example.springPro1.registrationFrom.service;

import com.example.springPro1.registrationFrom.dto.RegistrationDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface RegistrationFromService {

    ResponseEntity<?>saveRegistration(RegistrationDto registrationDto);

    ResponseEntity<?> getRegistartion(Long id);
}
