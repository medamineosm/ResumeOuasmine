package com.osm.guru.model;

import lombok.Data;
import org.apache.commons.text.WordUtils;

/**
 * Created by Ouasmine on 07/07/2018.
 */
@Data
public abstract class Person {
    public enum GENDER {male, female}
    private String firstName;
    private String lastName;
    private String familyName;
    private int age;
    private Address address;
    private String nationality;
    private String birthPlace;
    private String dateOfBirth;
    private GENDER gender;
    private String signature;
    private String fullName;
    private String phone;
    private String email;

    public String getFullName(){
        return WordUtils.capitalize(firstName) + " " + WordUtils.capitalize(lastName) + " " + WordUtils.capitalize(familyName);
    }

}
