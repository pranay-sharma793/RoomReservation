package com.hibernateDemo.reservation.repository;

import com.hibernateDemo.reservation.entity.Reservation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Repository
public interface IReservationRepository extends CrudRepository<Reservation,String>{

    @Query("select r from Reservation r where r.reservationDate=:#{#date}")
    public Iterable<Reservation> findReservationByDate(@Param("date")String date);

//    @Query("select r from Reservation r where r.reservationDate=2020-01-01")
//    public Iterable<Reservation> findReservationByDate();
}
