package tn.esprit.tp.foyer.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp.foyer.Entity.Chambre;
import tn.esprit.tp.foyer.Entity.Reservation;
import tn.esprit.tp.foyer.service.IReservationService;

import java.util.List;

@RestController
@RequestMapping("/reservation")
@Tag(name = "gestion reservation")
public class ReservationRestController {
    IReservationService reservationService;
    @GetMapping("/retrieve-Reservation")
    public List<Reservation> retrieveAll() {
        return reservationService.findAll();
    }

    @GetMapping("/retrieve-reservation/{id}")
    public Reservation retrieveById(@PathVariable("id") Long id) {
        return reservationService.findById(id);
    }

    @PostMapping("/add-reservation")
    public Reservation addReservation(@RequestBody Reservation reservation) {
        return reservationService.save(reservation);
    }
    @PutMapping("/update-reservation")
    public Reservation updateReservation(@RequestBody Reservation reservation) {
        return reservationService.save(reservation);
    }
    @DeleteMapping("/delete-reservation/{id}")
    public void deleteReservation(@PathVariable("id") Long id) {
        reservationService.delete(reservationService.findById(id));
    }
}
