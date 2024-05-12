package com.rentaroo.Car_Rental_Service.Service.Auth;

import com.rentaroo.Car_Rental_Service.DTO.SignupRequest;
import com.rentaroo.Car_Rental_Service.DTO.UserDto;
import com.rentaroo.Car_Rental_Service.Entity.User;
import com.rentaroo.Car_Rental_Service.Repo.UserRepo;
import com.rentaroo.Car_Rental_Service.enums.UserRole;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService{
    private final UserRepo userRepo;

    @Override
    public UserDto createCustomer(SignupRequest signupRequest) {
        User user = new User();
        user.setName(signupRequest.getName());
        user.setEmail(signupRequest.getEmail());
        user.setPassword(signupRequest.getPassword());
        user.setUserRole(UserRole.CUSTOMER);
        User createdUser = userRepo.save(user);
        UserDto userDto = new UserDto();
        userDto.setId(createdUser.getId());
        return userDto;
    }

    @Override
    public boolean hasCustomerWithEmail(String email) {
        User user = userRepo.findFirstByEmail(email);
        return user != null;

    }
}
