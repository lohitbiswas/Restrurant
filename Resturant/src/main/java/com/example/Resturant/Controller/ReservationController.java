package com.example.Resturant.Controller;

import com.example.Resturant.Entity.Reservation;
import com.example.Resturant.Service.ReservationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/api/reservations")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @GetMapping
    public List<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }

    @GetMapping("/{id}")
    public Optional<Reservation> getReservationById(@PathVariable String id) {
        return reservationService.getReservationById(id);
    }

    @GetMapping("/checkBookingStatus")
    public String checkBookingStatus(
            @RequestParam String tableId,
            @RequestParam int partySize) {
        try {
            log.info("Checking booking status for tableId: {} and partySize: {}", tableId, partySize);
            String  status = reservationService.check_booking_status(tableId, partySize);
            log.info("Booking status: {}", status);
            return status;
        } catch (Exception e) {
            log.error("Error checking booking status for tableId: {} and partySize: {}", tableId, partySize, e);
            return "not booked"; // You can also return a custom error response here
        }
    }

    @PostMapping
    public Reservation addReservation(@RequestBody Reservation reservation) {
        return reservationService.addReservation(reservation);
    }

    @DeleteMapping("/{id}")
    public void deleteReservation(@PathVariable String id) {
        reservationService.deleteReservation(id);
    }


}

