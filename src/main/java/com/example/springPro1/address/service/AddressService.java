package com.example.springPro1.address.service;

import com.example.springPro1.address.dto.AddressDto;
import org.springframework.http.ResponseEntity;

public interface AddressService {
    ResponseEntity<?>saveAddress(AddressDto addressDto);
}
