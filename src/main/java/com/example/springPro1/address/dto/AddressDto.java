package com.example.springPro1.address.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressDto {
    private Integer flatNo;

    private Integer laneNo;

    private Integer pincode;

    private Boolean isdelete=false;

}
