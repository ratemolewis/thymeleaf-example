package com.zalego.io.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/events")
public class EventsController {
    @GetMapping("/event")
    public String getEvent(Model model){
        model.addAttribute("event");
        return "event";
    }
}
