package com.rentaroo.Car_Rental_Service.Repo;

import com.rentaroo.Car_Rental_Service.Entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends MongoRepository<User, Long> {

    User findFirstByEmail(String email);
}
