package tn.esprit.tp.foyer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tn.esprit.tp.foyer.Entity.Chambre;
import tn.esprit.tp.foyer.Entity.TypeChambre;

import java.util.List;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre, Long> {

    List<Chambre> findAllByTypeChambre(TypeChambre typeChambre);
    List<Chambre> findByNumeroChambre(Long numeroChambre);
    Chambre findByNumeroChambre(long numeroChambre );

    List<Chambre> findByNumeroChambreBetween(Long from, Long to);

    @Query("SELECT distinct (ch) FROM Chambre ch " +
            "INNER JOIN ch.reservations r " +
            "INNER JOIN r.etudiants e " +
            "WHERE e.cin=:cin " )
    Chambre trouverChselonEt(long cin);

}
