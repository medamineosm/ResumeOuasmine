package com.osm.guru.service;

import com.osm.guru.model.*;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Ouasmine on 07/07/2018.
 */
@Service
public class EngineerService {

    public Engineer getAmine(){
        Engineer amine = new Engineer();
        amine.setFirstName("Mohammed");
        amine.setLastName("Amine");
        amine.setFamilyName("Ouasmine");
        amine.setBirthPlace("Casablanca, Morocco");
        amine.setAddress(getAddress());
        amine.setAge(25);
        amine.setDateOfBirth("Dec 03, 1992");
        amine.setGender(Person.GENDER.male);
        amine.setSignature("Med Amine Ouasmine");
        amine.setNationality("Moroccan");
        amine.setWorkNow(getWork());
        amine.setSocialMedia(getSocialMedia());
        amine.setEmail("mohammed.amine@ouasmine.com");
        amine.setPhone("(33)-663-555134");
        amine.setProjectCompleted(35);
        amine.setWinningAward(1);
        amine.setHappyClient(30);
        amine.setRunningProject(3);
        amine.setAboutMe("description about me");
        amine.setAboutMySkills("description about my skills");
        amine.setLanguages(getLanguages());
        amine.setSkills(getSkills());
        return amine;
    }

    private Address getAddress(){
        Address address = new Address();
        address.setStreet("28 Cherbourg Street");
        address.setCodePostal(75015);
        address.setCity("Paris");
        address.setCountry("FRANCE");
        return address;
    }

    private Work getWork(){
        Work workNow = new Work();
        workNow.setPoste("Full Stack Engineer");
        workNow.setCompany(getPixalione());
        workNow.setStartDate(new Date(2016, 10, 1));
        return workNow;
    }

    private Company getPixalione(){
        Company company = new Company();
        company.setName("Pixalione");
        company.setWebsite("https://www.pixalione.fr/");
        company.setLogo("static/logos/pixalione.jpg");
        return company;
    }

    private SocialMedia getSocialMedia(){
        SocialMedia socialMedia = new SocialMedia();
        socialMedia.setFacebook("https://www.facebook.com/med.amiine.wasmiine");
        socialMedia.setTwitter("https://twitter.com/OsmAmine");
        socialMedia.setLinkedIn("https://www.linkedin.com/in/m-a-ouasmine/");
        socialMedia.setGithub("https://github.com/medamineosm");
        return socialMedia;
    }

    private Set<Language> getLanguages(){
        Set<Language> languages = new HashSet<>();
        languages.add(new Language("Arabic", 100));
        languages.add(new Language("French", 100));
        languages.add(new Language("English", 90));
        languages.add(new Language("Japanese", 5));
        return languages;
    }

    private Set<Skill> getSkills(){
        Set<Skill> skills = new HashSet<>();
        skills.add(new Skill("Java & Scala", 90));
        skills.add(new Skill("DevOps", 90));
        skills.add(new Skill("Python for Machine learning", 50));
        skills.add(new Skill("Spring Framework", 80));
        skills.add(new Skill("NoSQL & SQL Databases", 80));
        skills.add(new Skill("Angular & ReactJs", 70));
        return skills;
    }

}
