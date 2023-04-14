package com.krzysiek1421.eventplanner.Model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "vendors")
public class Vendor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToMany
    @JoinTable(
            name = "vendors_items",
            joinColumns = @JoinColumn(name = "vendor_id"),
            inverseJoinColumns = @JoinColumn(name = "event_id")
    )
    private Set<Event> events;

    @OneToMany(mappedBy = "booking")
    private Set<Booking> bookings;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    private String vendorName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Event> getEvents() {
        return events;
    }

    public void setEvents(Set<Event> events) {
        this.events = events;
    }

    public Set<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(Set<Booking> bookings) {
        this.bookings = bookings;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }
}
