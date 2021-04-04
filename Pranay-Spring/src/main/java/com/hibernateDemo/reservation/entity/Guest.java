package com.hibernateDemo.reservation.entity;

import javax.persistence.*;

@Entity
@Table(name = "GUEST")
public class Guest {

    @Id
    @Column(name = "GUEST_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int guestId;

    @Column(name = "FIRST_NAME")
    private String fName;

    @Column(name = "LAST_NAME")
    private String lName;

    @Column(name = "EMAIL_ADDRESS")
    private String emailAdr;

    @Column(name = "ADDRESS")
    private String adr;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "STATE")
    private String state;

    @Column(name = "PHONE_NUMBER")
    private String phnNo;

    public int getGuestId() {
        return guestId;
    }

    public void setGuestId(int guestId) {
        this.guestId = guestId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmailAdr() {
        return emailAdr;
    }

    public void setEmailAdr(String emailAdr) {
        this.emailAdr = emailAdr;
    }

    public String getAdr() {
        return adr;
    }

    public void setAdr(String adr) {
        this.adr = adr;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhnNo() {
        return phnNo;
    }

    public void setPhnNo(String phnNo) {
        this.phnNo = phnNo;
    }
}
