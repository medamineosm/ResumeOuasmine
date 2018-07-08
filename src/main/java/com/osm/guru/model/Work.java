package com.osm.guru.model;

import lombok.Data;

/**
 * Created by Ouasmine on 07/07/2018.
 */
@Data
public class Work extends Period{
    private Company company;
    private String poste;
}
