package com.zalego.io.demo.Repo;

import com.zalego.io.demo.entities.Dishes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface DishesRepo extends JpaRepository<Dishes,Long> {
    Optional<Dishes> findById(long id);
//    List<Dishes> findAllByMenu_id(Menu menu);
    List<Dishes> findDishesByDeletedStatus(boolean status);
}
