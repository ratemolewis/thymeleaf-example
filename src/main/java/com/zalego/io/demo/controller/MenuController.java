package com.zalego.io.demo.controller;

import com.zalego.io.demo.entities.Menu;
import com.zalego.io.demo.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

}
