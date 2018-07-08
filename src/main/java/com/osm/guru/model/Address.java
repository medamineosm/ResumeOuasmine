package com.osm.guru.model;

import lombok.Data;

/**
 * Created by Ouasmine on 07/07/2018.
 */
@Data
public class Address {

    private String city;
    private int codePostal;
    private String street;
    private String country;
}
