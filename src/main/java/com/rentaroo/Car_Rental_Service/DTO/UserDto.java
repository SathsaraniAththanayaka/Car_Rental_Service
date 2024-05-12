package com.rentaroo.Car_Rental_Service.DTO;


import com.rentaroo.Car_Rental_Service.enums.UserRole;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    private String id;

    private String name;

    private String email;

    private UserRole userRole;
}
