package com.krzysiek1421.eventplanner.Model;

import com.krzysiek1421.eventplanner.util.EventStatus;
import jakarta.persistence.*;

import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Enumerated(EnumType.STRING)
    private EventStatus status;

    private Date date;
    private String timeline;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EventStatus getStatus() {
        return status;
    }

    public void setStatus(EventStatus status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTimeline() {
        return timeline;
    }

    public void setTimeline(String timeline) {
        this.timeline = timeline;
    }

}
