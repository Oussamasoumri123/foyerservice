package tn.esprit.tp.foyer.service;

import tn.esprit.tp.foyer.Entity.Etudiant;

import java.util.List;

public interface IEtudiantService {
    Etudiant ajouterEtudiant(Etudiant et);
    void supprimerEtudiant(Etudiant et);
    Etudiant modifierEtudiant(Etudiant et);
    List<Etudiant> getEtudiants();
    Etudiant getEtudiant(Long id);
    Etudiant findEtudiant(Long id);
}
