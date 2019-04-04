package com.zalego.io.demo.controller;

import com.zalego.io.demo.entities.Location;
import com.zalego.io.demo.services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/location")
public class LocationController {
    @Autowired
    private LocationService service;

    @PostMapping
    public Location addLocation(@RequestBody Location   location){
        return service.addLocation(location);
    }
    @GetMapping
    public List<Location> findAll(){
        return service.findAll();
    }
}
