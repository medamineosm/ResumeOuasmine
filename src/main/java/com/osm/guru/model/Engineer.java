package com.osm.guru.model;

import lombok.Data;

import java.util.Set;

/**
 * Created by Ouasmine on 07/07/2018.
 */
@Data
public class Engineer extends Person{

    private Set<InternShip> internShips;
    private Set<Skill> skills;
    private Set<Language> languages;
    private Work workNow;
    private SocialMedia socialMedia;
    private int projectCompleted;
    private int winningAward;
    private int happyClient;
    private int runningProject;
    private String aboutMe;
    private String aboutMySkills;
    private String aboutMyLanguages;
}
