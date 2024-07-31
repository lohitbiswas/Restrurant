package com.example.Resturant.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "reservations")
public class Reservation {
    @Id
    private String id;
    private String tableId;
    private String resturantId;
    private String userId;
    private String customerName;
    private String customerContact;
    //private LocalDateTime dateTime;
    private int partySize;


}

