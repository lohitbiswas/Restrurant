package com.example.Resturant.Controller;


import com.example.Resturant.Entity.Resturant;
import com.example.Resturant.Service.ResturantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/restaurants")
public class ResturantController {

    @Autowired
    private ResturantService resturantService;

    @GetMapping
    public List<Resturant> getAllResturants() {

        return resturantService.getAllResturants();
    }

    @GetMapping("/{id}")
    public Optional<Resturant> getResturantById(@PathVariable String id) {
        return resturantService.getResturantById(id);
    }

    @PostMapping
    public Resturant addResturant(@RequestBody Resturant resturant) {
        return resturantService.addResturant(resturant);
    }

    @DeleteMapping("/{id}")
    public void deleteResturant(@PathVariable String id) {
        resturantService.deleteResturant(id);
    }
}

