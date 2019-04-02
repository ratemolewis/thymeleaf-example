package com.zalego.io.demo.services;

import com.zalego.io.demo.Repo.DishesRepo;
import com.zalego.io.demo.entities.Dishes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishesService {
    @Autowired
    DishesRepo repository;

    public List<Dishes> findByName(){
        return repository.findAll();

    }
}
