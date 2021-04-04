package com.hibernateDemo.reservation.repository;

import com.hibernateDemo.reservation.entity.Guest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGuestRepository extends CrudRepository<Guest,Long> {
}
