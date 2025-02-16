package tn.esprit.tp.foyer.service;

import tn.esprit.tp.foyer.Entity.Reservation;
import tn.esprit.tp.foyer.repository.ReservationRepository;

import java.util.List;
import java.util.Optional;

public class ReservationServiceImpl implements IReservationService{
    ReservationRepository reservationRepository;
    @Override
    public List<Reservation> findAll() {
       return reservationRepository.findAll();
    }

    @Override
    public Reservation findById(Long id) {
        return reservationRepository.findById(id).orElse(null);
    }

    @Override
    public Reservation save(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void delete(Reservation reservation) {
        reservationRepository.delete(reservation);

    }

    @Override
    public Reservation update(Reservation reservation) {
        return reservationRepository.save(reservation);
    }
}
