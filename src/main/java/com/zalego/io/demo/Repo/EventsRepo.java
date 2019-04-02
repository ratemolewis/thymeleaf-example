package com.zalego.io.demo.Repo;

import com.zalego.io.demo.entities.Events;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventsRepo extends JpaRepository<Events,Long> {
}
