package com.example.springPro1.address.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "Address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @Column(name = "flatno")
    private Integer flatNo;

    @Column(name = "laneno")
    private Integer laneNo;

    @Column(name = "pincode")
    private Integer pincode;

    @Column(name = "isdelete")
    private Boolean isdelete;
}
