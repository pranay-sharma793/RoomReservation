package com.hibernateDemo.reservation.Web;

import com.hibernateDemo.reservation.Business.Domain.RoomReservation;
import com.hibernateDemo.reservation.Business.Service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/reservations")
public class ReservationWebController {
    private final ReservationService reservationService;

    @Autowired
    public ReservationWebController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping
    public String getReservations(@RequestParam(value = "date",required = false)String dateString, Model model){
        //String datee = "2009-12-12";
        Date date = DateUtils.createDatefromDateString(dateString);
        List<RoomReservation> roomReservations = this.reservationService.RoomReservationforDate(dateString);
        model.addAttribute("roomReservations", roomReservations);
        return "reservations";
    }
}
