package com.zalego.io.demo.controller;

import com.zalego.io.demo.entities.Hotel;
import com.zalego.io.demo.entities.Users;
import com.zalego.io.demo.services.HotelServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelController {
    @Autowired
    private HotelServices services;

    @PostMapping
    public Hotel addHotel(@RequestBody Hotel hotel) {
        services.addHotel(hotel);
        System.out.println(hotel.getName() + "the value");
      System.out.println(hotel.getLocation().getId() + "the value");
        return services.addHotel(hotel);
    }

    @GetMapping
    public List<Hotel>findAll(){
        return services.findAll();}

    @GetMapping("/{id}")
    public List<Hotel> findHotelByUsser(@PathVariable long id){
        Users user = new Users();
        user.setId(id);
        return services.findByHotelsByUser(user);
    }
    @DeleteMapping("/{id}")
    public void DeleteHotel(@PathVariable long id){
        services.deleteHotel(id);
    }
}

