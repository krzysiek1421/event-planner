package com.krzysiek1421.eventplanner.repositories;

import com.krzysiek1421.eventplanner.model.EventItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventItemRepository extends JpaRepository<EventItem, Integer> {

}
