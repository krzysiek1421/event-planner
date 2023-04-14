package com.krzysiek1421.eventplanner.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "item_quantities")
public class ItemQuantity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int quantity;

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
