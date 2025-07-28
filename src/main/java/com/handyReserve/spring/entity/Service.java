package com.handyReserve.spring.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "services")
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tittle;
    private String body;

    @Column(name = "status_booking")
    private Boolean statusBooking;

    @Column(name = "created_at")
    private Date createdAt;

    @ManyToOne
    @JoinColumn(name="user_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "service_post_id") // o usa el nombre que realmente tenga tu columna FK
    private ServicesPost serviceId;


}
