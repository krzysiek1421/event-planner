package com.krzysiek1421.eventplanner.logic;

import com.krzysiek1421.eventplanner.repositories.EventRepository;
import org.springframework.stereotype.Service;

@Service
public class EventService {
    private final EventRepository eventRepository;

    EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }


}
