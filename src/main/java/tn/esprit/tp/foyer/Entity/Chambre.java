package tn.esprit.tp.foyer.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Chambre {

    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private Long idChambre;
    long numeroChambre;
    TypeChambre typeChambre;
    @ManyToOne()
   Bloc bloc;
    @OneToMany
    Set<Reservation> reservations;

}
