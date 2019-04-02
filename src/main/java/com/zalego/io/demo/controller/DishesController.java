package com.zalego.io.demo.controller;

import com.zalego.io.demo.services.DishesService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dishes")
public class DishesController {

    private DishesService service;
}
