package com.krzysiek1421.eventplanner.model;

import jakarta.persistence.*;

@Entity
@Table(name = "item_quantities")
public class ItemQuantity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int quantity;

    ItemQuantity(int quantity) {
    this.quantity = quantity;
    }

    public ItemQuantity() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
