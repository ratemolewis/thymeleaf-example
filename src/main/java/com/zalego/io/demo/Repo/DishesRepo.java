package com.zalego.io.demo.Repo;

import com.zalego.io.demo.entities.Dishes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishesRepo extends JpaRepository<Dishes,Long> {
}
