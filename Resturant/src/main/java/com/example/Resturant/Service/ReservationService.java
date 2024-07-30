package com.example.Resturant.Service;

import com.example.Resturant.Entity.Reservation;
import com.example.Resturant.Repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    public Optional<Reservation> getReservationById(String id) {
        return reservationRepository.findById(id);
    }

    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    public void deleteReservation(String id) {
        reservationRepository.deleteById(id);
    }
}

