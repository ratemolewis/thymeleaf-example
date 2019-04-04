package com.zalego.io.demo.services;

import com.zalego.io.demo.Repo.DishesRepo;
import com.zalego.io.demo.entities.Dishes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DishesService {
    @Autowired
   private  DishesRepo repository;

//    public List<Dishes> findByName(){
//        return repository.findAll();
//
//    }

     public List<Dishes> findAll(){
         return repository.findDishesByDeletedStatus(false);
     }
    public Dishes addDish(Dishes dishers){

        return  repository.save(dishers);
    }

     public List<Dishes> findById(long id){
//        Dishes[] dishes= {new Dishes()};
         List<Dishes> dishes= new ArrayList<>();
        repository.findById(id).ifPresent(dish ->{
//                    dishes[0]=dish;
                    dishes.add(dish);
                }

                );
//        return dishes[0];
         return dishes;
     }

     public void deleteDish(long id){
        repository.findById(id).ifPresent(dish ->{
            dish.setDeletedStatus(false);
            repository.save(dish);
        });
     }
//     public List<Dishes> findByName(Menu dishName){
//
//         return repository.findAllByMenu_id(dishName);
//     }
}
