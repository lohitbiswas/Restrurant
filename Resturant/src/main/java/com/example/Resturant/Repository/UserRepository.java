package com.example.Resturant.Repository;

import com.example.Resturant.Entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String > {
    Optional<User> findById(String id);
}
