package com.example.springPro1.api;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class ApiResponse<A> {
    private A result;
    private String message;
    private Integer statusCode;
    private Long count;

}
