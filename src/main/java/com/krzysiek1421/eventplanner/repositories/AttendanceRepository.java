package com.krzysiek1421.eventplanner.repositories;

import com.krzysiek1421.eventplanner.model.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Integer> {

}
