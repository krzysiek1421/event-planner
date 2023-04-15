package com.krzysiek1421.eventplanner.repositories;

import com.krzysiek1421.eventplanner.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {

}
