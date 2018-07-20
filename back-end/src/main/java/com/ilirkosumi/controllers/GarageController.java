package com.ilirkosumi.controllers;

import com.ilirkosumi.domain.Garage;
import com.ilirkosumi.domain.Info;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GarageController {
    @RequestMapping("/garage")
    public Garage garage() {
        final Info info = new Info(150, "open");
        final Garage garage = new Garage("Bavaria Park Garage GmbH", info);
        return garage;
    }
}