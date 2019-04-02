package com.zalego.io.demo.controller;

import com.zalego.io.demo.entities.Hotel;
import com.zalego.io.demo.entities.Menu;
import com.zalego.io.demo.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/menus")

public class MenuController {
    @Autowired
    private MenuService service;

}
