package com.triveratravel.repository;

import com.triveratravel.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    // rather than implementing ourselves we extend a Spring Data JPA
    // interface and have Spring generate an implementation of this interface for use
}
