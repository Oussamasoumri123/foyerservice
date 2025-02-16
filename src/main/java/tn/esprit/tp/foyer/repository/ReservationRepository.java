package tn.esprit.tp.foyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tp.foyer.Entity.Reservation;
@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
