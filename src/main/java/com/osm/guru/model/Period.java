package com.osm.guru.model;

import lombok.Data;

import java.util.Date;

/**
 * Created by Ouasmine on 07/07/2018.
 */
@Data
public abstract class Period {

    private Date startDate;
    private Date endDate;
    private String description;
}
