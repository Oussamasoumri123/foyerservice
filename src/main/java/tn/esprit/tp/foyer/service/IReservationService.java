package tn.esprit.tp.foyer.service;

import tn.esprit.tp.foyer.Entity.Reservation;

import java.util.List;
import java.util.Optional;

public interface IReservationService {
    List<Reservation> findAll();
    Reservation findById(Long id);
    Reservation save(Reservation reservation);
    void delete(Reservation reservation);
    Reservation update(Reservation reservation);
}
