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

    public List<Menu> findAll(){

        return repository.findMenuByDeletedStatus(false);
    }

    public Menu addMenu(Menu menu)
    {
        return repository.save(menu);
    }
  public Menu findById(long id){
       Menu[] menu= {new Menu()};
       repository.findById(id).ifPresent(menu1->{
           menu[0]=menu1;
       });
       return menu[0];
  }
  public void deleteMenu(long id){
        repository.findById(id).ifPresent(menu -> {
            menu.setDeletedStatus(true);
            repository.save(menu);
        });
  }
}
