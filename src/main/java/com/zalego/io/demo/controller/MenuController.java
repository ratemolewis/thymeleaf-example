package com.zalego.io.demo.controller;

import com.zalego.io.demo.entities.Menu;
import com.zalego.io.demo.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menus")

public class MenuController {

    @Autowired
    private MenuService service;

   @GetMapping("menu")
    public String getMenu(Model model){
       model.addAttribute("menu");
       return "menu";
   }

   @RequestMapping(method = RequestMethod.POST,value = "/add_menu")
   public Menu addMenu (@RequestBody Menu menu){

       return service.addMenu(menu);
   }


   @RequestMapping(method=RequestMethod.GET,value = "/get_menu")
    public List<Menu>  getMenus(){
       return service.findAll();
   }
   @GetMapping("/id/{id}")
    public Menu getHotelById(long id){
       return service.findById(id);
   }
   @RequestMapping(method=RequestMethod.GET,value = "/delete")
    public void deletMenu(long id){
       service.deleteMenu(id);
   }
}
