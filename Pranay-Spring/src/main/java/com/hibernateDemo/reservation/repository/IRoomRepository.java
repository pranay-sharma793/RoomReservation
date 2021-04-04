package com.hibernateDemo.reservation.repository;

import com.hibernateDemo.reservation.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoomRepository extends CrudRepository<Room,Long> {
}
