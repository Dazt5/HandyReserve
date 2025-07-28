package com.handyReserve.spring.repository;


import com.handyReserve.spring.entity.Booking;
import org.springframework.data.repository.CrudRepository;

public interface BookingRepository extends CrudRepository<Booking,Long> {
}
