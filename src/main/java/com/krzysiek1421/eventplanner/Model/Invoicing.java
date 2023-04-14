package com.krzysiek1421.eventplanner.Model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "invoicing")
public class Invoicing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name = "event_id")
    private Event event;

    private BigDecimal grossPrice;
    private BigDecimal netPrice;
    private int vatRate;
    private int discount;
    private int additionalFees;

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

    public BigDecimal getGrossPrice() {
        return grossPrice;
    }

    public void setGrossPrice(BigDecimal grossPrice) {
        this.grossPrice = grossPrice;
    }

    public BigDecimal getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(BigDecimal netPrice) {
        this.netPrice = netPrice;
    }

    public int getVatRate() {
        return vatRate;
    }

    public void setVatRate(int vatRate) {
        this.vatRate = vatRate;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getAdditionalFees() {
        return additionalFees;
    }

    public void setAdditionalFees(int additionalFees) {
        this.additionalFees = additionalFees;
    }
}
