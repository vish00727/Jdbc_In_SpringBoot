package com.example.springPro1.registrationFrom.controller;

import com.example.springPro1.registrationFrom.dto.RegistrationDto;
import com.example.springPro1.registrationFrom.service.RegistrationFromService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@CrossOrigin(origins = "*")
public class RegistrationController {
    @Autowired
    private RegistrationFromService registrationFromService;

    @PostMapping("/saveRegistration")
    public ResponseEntity<?>saveReegistration(@RequestBody  RegistrationDto registrationDto){
        return  registrationFromService.saveRegistration(registrationDto);
    }
    @GetMapping("/getRegistrationid")
    public ResponseEntity<?> getRegistration(@RequestParam Long id){
     return  registrationFromService.getRegistartion(id);
    }
}
