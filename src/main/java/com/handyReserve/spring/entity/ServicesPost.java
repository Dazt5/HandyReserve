package com.handyReserve.spring.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="service_post")
public class ServicesPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @OneToMany(mappedBy = "serviceId")
    private List<Service> Services;

    @Column(name = "cost_per_hour")
    private Double costPerHour;

    @Column(name = "category_id")
    private String categoryId;

    @ManyToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;

}
