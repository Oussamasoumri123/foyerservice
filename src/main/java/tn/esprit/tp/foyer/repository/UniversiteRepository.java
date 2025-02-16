package tn.esprit.tp.foyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tp.foyer.Entity.Universite;

@Repository
public interface UniversiteRepository extends JpaRepository<Universite, Long> {
}
