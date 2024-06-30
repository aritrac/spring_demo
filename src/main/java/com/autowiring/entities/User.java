package com.autowiring.entities;

import jakarta.persistence.*;

@Entity
@Table(name="USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userSeq_generator")
    @SequenceGenerator(name = "userSeq_generator", sequenceName = "user_seq")
    private int customerId;

    @Column(name = "address")
    private String userAddress;
}
