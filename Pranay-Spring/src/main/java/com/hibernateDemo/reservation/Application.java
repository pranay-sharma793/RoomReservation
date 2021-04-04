package com.hibernateDemo.reservation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @RestController
//    @RequestMapping("/rooms")
//    public class RoomController{
//
//        @Autowired
//        private IRoomRepository roomRepository;
//
//        @GetMapping
//        public Iterable<Room> getRooms(){
//            return this.roomRepository.findAll();
//        }
//    }
//
//    @RestController
//    @RequestMapping("/guests")
//    public class GuestController{
//
//        @Autowired
//        private IGuestRepository guestRepository;
//
//        @GetMapping
//        public Iterable<Guest> getGuest(){
//            return this.guestRepository.findAll();
//        }
//    }
//
//    @RestController
//    @RequestMapping("/reservations")
//    public class ResvController{
//
//        @Autowired
//        private IReservationRepository resvRepository;
//
//        @GetMapping
//        public Iterable<Reservation> getResv(){
//            return this.resvRepository.findAll();
//        }
//    }

}
