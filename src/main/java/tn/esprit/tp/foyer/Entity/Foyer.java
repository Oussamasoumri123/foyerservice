package tn.esprit.tp.foyer.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;
@Entity
@Data
@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Foyer {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    long idFoyer;
    String nomFoyer;
    long capaciteFoyer;
    //assosiations
    @OneToOne(mappedBy = "foyer")
    Universite universite;
    @OneToMany (mappedBy = "foyer",cascade = CascadeType.ALL)
    Set<Bloc> blocs;
}
