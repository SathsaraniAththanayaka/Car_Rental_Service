package com.rentaroo.Car_Rental_Service.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignupRequest {
    private String email;
    private String name;
    private String password;
}
