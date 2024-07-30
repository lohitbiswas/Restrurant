package com.example.Resturant.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Slf4j
@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Resturant {
    @Id
    private String id;
    private String name;
    private String location;
    private String type;

}
