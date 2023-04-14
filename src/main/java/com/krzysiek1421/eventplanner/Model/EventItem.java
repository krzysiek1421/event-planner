package com.krzysiek1421.eventplanner.Model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "event_items")
public class EventItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name = "item_quantity_id")
    private ItemQuantity itemQuantity;

    @ManyToMany
    @JoinTable(
            name = "event_items_vendors",
            joinColumns = @JoinColumn(name = "event_item_id"),
            inverseJoinColumns = @JoinColumn(name = "event_id")
    )
    private Set<Event> events;

    @OneToMany(mappedBy = "booking")
    @JoinColumn(name = "booking_id")
    private Set<Booking> booking;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    private String itemName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ItemQuantity getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(ItemQuantity itemQuantity) {
        this.itemQuantity = itemQuantity;
    }


    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Set<Event> getEvents() {
        return events;
    }

    public void setEvents(Set<Event> events) {
        this.events = events;
    }

    public Set<Booking> getBooking() {
        return booking;
    }

    public void setBooking(Set<Booking> booking) {
        this.booking = booking;
    }
}
