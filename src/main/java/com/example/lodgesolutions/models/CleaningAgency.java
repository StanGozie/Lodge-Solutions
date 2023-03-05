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
public class CleaningAgency extends BaseClass{


    private String name;
    private String email;
    private String website;
    private String location;
    private String phoneNumber;
}
