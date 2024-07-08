package com.example.springPro1.registrationFrom.entity;


import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "registrationform")
public  class RegistrationFrom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "middlename")
    private  String middleName;

    @Column(name="lastname")
    private String lastName;

    private LocalDate age;

    @Column(name = "aadharcardno")
    private  Long aadharCardNo;

    private String department;

    private  String address;

}
