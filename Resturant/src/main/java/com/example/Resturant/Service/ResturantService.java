package com.example.Resturant.Service;



import com.example.Resturant.Entity.Resturant;
import com.example.Resturant.Repository.ResturantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResturantService {

    @Autowired
    private ResturantRepository resturantRepository;

    public List<Resturant> getAllResturants() {
        return resturantRepository.findAll();
    }

    public Optional<Resturant> getResturantById(String id) {
        return resturantRepository.findById(id);
    }

    public Resturant addResturant(Resturant resturant) {
        return resturantRepository.save(resturant);
    }

    public void deleteResturant(String id) {
        resturantRepository.deleteById(id);
    }
}

