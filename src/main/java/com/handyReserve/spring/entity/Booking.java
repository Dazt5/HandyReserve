package com.handyReserve.spring.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table (name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Boolean status;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "time_average")
    private Date timeAverage;



}
