package com.osm.guru.controller;

import com.osm.guru.service.EngineerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by Ouasmine on 07/07/2018.
 */
@Controller
public class HomeController {
    private final EngineerService engineerService;

    @Autowired
    public HomeController(EngineerService engineerService) {
        this.engineerService = engineerService;
    }

    @RequestMapping(value = { "/", "/index", "/home" })
    public String index(Map<String, Object> model) {
        init(model);
        model.put("engineer", engineerService.getAmine());
        return "index";
    }

    private Map<String, Object> init(Map<String, Object> model){
        model.put("title", "Ouasmine Mohammed Amine | Personal Portfolio & Resume.");
        return model;
    }
}
