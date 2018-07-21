package com.ilirkosumi.controllers;

import com.ilirkosumi.domain.Garage;
import com.ilirkosumi.domain.repository.GarageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GarageController {

    @Autowired
    private GarageRepository garageRepository;

    @GetMapping("/garage")
    public List<Garage> getGarage() {
        return garageRepository.findAll();
    }
}