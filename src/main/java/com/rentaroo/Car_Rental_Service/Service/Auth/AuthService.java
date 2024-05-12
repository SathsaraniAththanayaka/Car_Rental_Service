package com.rentaroo.Car_Rental_Service.Service.Auth;

import com.rentaroo.Car_Rental_Service.DTO.SignupRequest;
import com.rentaroo.Car_Rental_Service.DTO.UserDto;
import com.rentaroo.Car_Rental_Service.Entity.User;

import java.util.Optional;

public interface AuthService {
    UserDto createCustomer(SignupRequest signupRequest);

    boolean hasCustomerWithEmail(String email);
}
