package com.hibernateDemo.reservation.repository;

import com.hibernateDemo.reservation.entity.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Repository
public interface IReservationRepository extends CrudRepository<Reservation,Long> {
    Iterable<Reservation> findReservationByReservationDate(Date date);
}
