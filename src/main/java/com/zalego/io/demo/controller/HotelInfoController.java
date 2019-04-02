package com.zalego.io.demo.controller;

import com.zalego.io.demo.entities.HotelInfo;
import com.zalego.io.demo.services.HotelInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hotelinfo")
public class HotelInfoController {

    @Autowired
    private HotelInfoService service;

    @PostMapping
    public HotelInfo add(@RequestBody HotelInfo info){
        return service.addHotel(info);
    }
}
