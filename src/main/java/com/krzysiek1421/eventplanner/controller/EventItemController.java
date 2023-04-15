package com.krzysiek1421.eventplanner.controller;


import com.krzysiek1421.eventplanner.model.EventItem;
import com.krzysiek1421.eventplanner.repositories.EventItemRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@Controller
@RequestMapping("/eventItem")
public class EventItemController {
    private final Logger log = LoggerFactory.getLogger(EventItemController.class);
    private final EventItemRepository eventItemRepository;

    EventItemController(EventItemRepository eventItemRepository) {
        this.eventItemRepository = eventItemRepository;
    }

    @PostMapping("/addNew")
    ResponseEntity<EventItem> createEventItem(@RequestBody @Valid EventItem eventItem){
        log.warn("Creating new event item: " + eventItem.toString());
        EventItem result = eventItemRepository.save(eventItem);
        return ResponseEntity.created(URI.create("/"+ result.getId())).body(result);
    }

    @PatchMapping("/update/{id}")
    ResponseEntity<EventItem> updateEventItem(@RequestBody @Valid EventItem eventItem){
        log.warn("Updating event item: " + eventItem.toString());
        EventItem result = eventItemRepository.save(eventItem);
        return ResponseEntity.ok().body(result);
    }

    @GetMapping("/get/{id}")
    ResponseEntity<EventItem> getEventItem(@PathVariable int id){
        log.warn("Getting event item with id: " + id);
        if(!eventItemRepository.existsById(id)){
            log.warn("Event item with id: " + id + " does not exist");
            return ResponseEntity.notFound().build();
        }
        else{
            EventItem result = eventItemRepository.findById(id).orElseThrow();
            return ResponseEntity.ok().body(result);
        }
    }

    @GetMapping(path = "/getAll", params = {"!sort", "!page", "!size"})
    ResponseEntity<List<EventItem>> getALl(){
        log.warn("Getting event items");
        return ResponseEntity.ok(eventItemRepository.findAll());
    }

    @GetMapping("/getAll")
    ResponseEntity<List<EventItem>> getAll(Pageable page){
        log.warn("Getting page of event items");
        return ResponseEntity.ok((eventItemRepository.findAll(page).getContent()));
    }

}
