package com.krzysiek1421.eventplanner.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "attendances")
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name = "event_id")
    private Event event;

    private int numberOfAttendees;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public int getNumberOfAttendees() {
        return numberOfAttendees;
    }

    public void setNumberOfAttendees(int numberOfAttendees) {
        this.numberOfAttendees = numberOfAttendees;
    }
}
