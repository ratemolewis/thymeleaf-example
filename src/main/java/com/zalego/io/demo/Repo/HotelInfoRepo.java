package com.zalego.io.demo.Repo;

import com.zalego.io.demo.entities.HotelInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelInfoRepo extends JpaRepository<HotelInfo,Long> {
}
