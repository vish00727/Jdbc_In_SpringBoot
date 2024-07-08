package com.example.springPro1.address.controller;
import com.example.springPro1.address.dto.AddressDto;
import com.example.springPro1.address.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 @RestController
 @RequestMapping
 public class AddressController {
    @Autowired
    private AddressService addressService;
    @PostMapping("/save")
    public ResponseEntity<?>saveAddress(@RequestBody AddressDto addressDto){
        return addressService.saveAddress(addressDto);
    }
}
