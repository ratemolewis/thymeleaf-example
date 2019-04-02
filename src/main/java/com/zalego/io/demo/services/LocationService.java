package com.zalego.io.demo.services;


import com.zalego.io.demo.Repo.LocationRepo;
import com.zalego.io.demo.entities.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {
    @Autowired
    private LocationRepo repository;

    public List<Location> findAll(){
        return repository.findAll();
    }
    public Location addLocation(Location location){
        return repository.save(location);
    }

}
