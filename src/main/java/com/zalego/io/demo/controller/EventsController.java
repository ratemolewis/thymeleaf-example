package com.zalego.io.demo.controller;

import com.zalego.io.demo.services.EventsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/events")
public class EventsController {
    private EventsService service;
}
