package com.krzysiek1421.eventplanner.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/event")
public class EventController {
    private final Logger log = LoggerFactory.getLogger(EventController.class);

}
