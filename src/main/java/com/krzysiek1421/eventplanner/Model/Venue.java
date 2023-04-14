package com.krzysiek1421.eventplanner.Model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "venues")
public class Venue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany
    @JoinColumn(name = "event_id")
    private Set<Event> event;

    @OneToMany
    @JoinColumn(name = "booking_id")
    private Set<Booking> booking;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    private String venueName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public Set<Event> getEvent() {
        return event;
    }

    public void setEvent(Set<Event> event) {
        this.event = event;
    }

    public Set<Booking> getBooking() {
        return booking;
    }

    public void setBooking(Set<Booking> booking) {
        this.booking = booking;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
