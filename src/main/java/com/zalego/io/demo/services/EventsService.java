package com.zalego.io.demo.services;

import com.zalego.io.demo.Repo.EventsRepo;
import com.zalego.io.demo.entities.Events;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventsService {
    @Autowired

    EventsRepo repository;
    public List<Events> findByHotel(){
        return repository.findAll();
    }
}
