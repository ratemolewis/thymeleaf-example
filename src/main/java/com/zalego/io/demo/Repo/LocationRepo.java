package com.zalego.io.demo.Repo;

import com.zalego.io.demo.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepo extends JpaRepository<Location,Long> {

}
