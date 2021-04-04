package com.hibernateDemo.reservation.entity;

import javax.persistence.*;

@Entity
@Table(name = "RESERVATION", indexes = @Index(columnList = "RES_DATE"))
public class Reservation {

    @Id
    @Column(name = "RESERVATION_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int resvId;

    @Column(name = "RES_DATE")
    private String reservationDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "roomId", referencedColumnName = "ROOM_ID")
    private Room room;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "guestId", referencedColumnName = "GUEST_ID")
    private Guest guest;

    public int getResvId() {
        return resvId;
    }

    public void setResvId(int resvId) {
        this.resvId = resvId;
    }

    public String getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(String reservationDate) {
        this.reservationDate = reservationDate;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }
}
