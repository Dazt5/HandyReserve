package com.handyReserve.spring.repository;


import com.handyReserve.spring.entity.Service;
import org.springframework.data.repository.CrudRepository;

public interface ServiceRepository extends CrudRepository<Service,Long> {
}
