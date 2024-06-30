package com.autowiring.entities;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Item {
    @ManyToOne
    @JoinColumn(name = "CART_ID")
    private Cart cart;
}
