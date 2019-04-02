package com.zalego.io.demo.services;

import com.zalego.io.demo.Repo.HotelInfoRepo;
import com.zalego.io.demo.entities.HotelInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelInfoService {

    @Autowired
    private HotelInfoRepo repo;

    public HotelInfo addHotel(HotelInfo info){
        return  repo.saveAndFlush(info);
    }
}
