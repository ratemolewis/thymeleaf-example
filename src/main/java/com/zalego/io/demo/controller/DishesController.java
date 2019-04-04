package com.zalego.io.demo.controller;

import com.zalego.io.demo.entities.Dishes;
import com.zalego.io.demo.services.DishesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dishes")
public class DishesController {

  @Autowired
  private DishesService dishesService;

  @PostMapping
  public Dishes addDishes(@RequestBody Dishes dishes){
      return dishesService.addDish(dishes);
  }
  @GetMapping("/id/{id}")
//@RequestMapping(value = "/{id}", method = RequestMethod.GET)Name
  public List<Dishes> findDishById(@PathVariable long id){

      return dishesService.findById(id);
  }
//  @GetMapping("/name/{name}")
//
//public List<Dishes> findByMenu(@PathVariable Menu menu_id){
//     return  dishesService.findByName(menu_id);
//  }

   @GetMapping
    public List<Dishes>  getDishes(){
       return  dishesService.findAll();
   }
   @DeleteMapping("/delete/{id}")
    public void deleteDish(@PathVariable long id){
      dishesService.deleteDish(id);
   }
//    public String getDishes(Model model){
//       model.addAttribute("dish");
//       return "dish";
//   }
}
