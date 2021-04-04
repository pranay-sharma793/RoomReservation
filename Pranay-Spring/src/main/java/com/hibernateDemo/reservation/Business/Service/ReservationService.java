package com.hibernateDemo.reservation.Business.Service;

import com.hibernateDemo.reservation.Business.Domain.RoomReservation;
import com.hibernateDemo.reservation.entity.Reservation;
import com.hibernateDemo.reservation.entity.Room;
import com.hibernateDemo.reservation.repository.IGuestRepository;
import com.hibernateDemo.reservation.repository.IReservationRepository;
import com.hibernateDemo.reservation.repository.IRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ReservationService {
    private final IRoomRepository roomRepository;
    private final IGuestRepository guestRepository;
    private final IReservationRepository reservationRepository;

    @Autowired
    public ReservationService(IRoomRepository roomRepository, IGuestRepository guestRepository, IReservationRepository reservationRepository) {
        this.roomRepository = roomRepository;
        this.guestRepository = guestRepository;
        this.reservationRepository = reservationRepository;
    }

    public List<RoomReservation> RoomReservationforDate(Date date){
        Iterable<Room> rooms = this.roomRepository.findAll();
        Map<Long, RoomReservation> roomReservationMap = new HashMap<>();
        rooms.forEach(room -> {
            RoomReservation roomReservation = new RoomReservation();
            roomReservation.setRoomId(room.getRoomId());
            roomReservation.setRoomNo(room.getRoomNo());
            roomReservation.setRoomName(room.getName());
            roomReservationMap.put(room.getRoomId(),roomReservation);
        });
        Iterable<Reservation> reservations = this.reservationRepository.findReservationByReservationDate(new java.sql.Date(date.getTime()));
        reservations.forEach(reservation -> {
            RoomReservation roomReservation = roomReservationMap.get(reservation.getRoom().getRoomId());
            roomReservation.setDate(date);
            roomReservation.setGuestId(reservation.getGuest().getGuestId());
            roomReservation.setfName(reservation.getGuest().getfName());
            roomReservation.setlName(reservation.getGuest().getlName());
        });
        List<RoomReservation> roomReservations = new ArrayList<>();
        for(Long id: roomReservationMap.keySet()){
            roomReservations.add(roomReservationMap.get(id));
        }
        return roomReservations;
    }
}
