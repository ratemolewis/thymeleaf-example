package com.zalego.io.demo.Repo;

import com.zalego.io.demo.entities.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuRepo extends JpaRepository<Menu,Long> {
    List<Menu> findMenuByDeletedStatus(boolean status);
}
