package com.autowiring.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Cart {
    @OneToMany(mappedBy = "cart")
    private List<Item> items;
}
