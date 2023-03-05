package com.example.lodgesolutions.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Apartment extends BaseClass{

    private String name;
    private String address;
    private String town;
    private String state;
    private String nearestLandmark;
}
