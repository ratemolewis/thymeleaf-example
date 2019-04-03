package com.zalego.io.demo.Repo;

import com.zalego.io.demo.entities.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepo extends JpaRepository<Menu,Long> {

}
