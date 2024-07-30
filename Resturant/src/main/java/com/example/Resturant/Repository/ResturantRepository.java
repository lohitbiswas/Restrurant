package com.example.Resturant.Repository;

import com.example.Resturant.Entity.Resturant;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ResturantRepository extends MongoRepository<Resturant,String> {

}
