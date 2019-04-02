package com.zalego.io.demo.Repo;

import com.zalego.io.demo.entities.Hotel;
import com.zalego.io.demo.entities.Location;
import com.zalego.io.demo.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface HotelRepo extends JpaRepository<Hotel,Long> {
    Optional<Hotel> findByLocation(Location location);
    List<Hotel> findByUser(Users users);
    List<Hotel> findHotelByDeletedStatus(boolean status);


}
