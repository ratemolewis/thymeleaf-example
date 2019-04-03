package com.zalego.io.demo.services;


import com.zalego.io.demo.Repo.MenuRepo;
import com.zalego.io.demo.entities.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MenuService {
    @Autowired
    private MenuRepo repository;

    public List<Menu> findById(){

        return repository.findAll();
    }

    public Menu addMenu(Menu menu){
        return repository.save(menu);
    }

}
