package tn.esprit.tp.foyer.service;

import tn.esprit.tp.foyer.Entity.Etudiant;
import tn.esprit.tp.foyer.repository.EtudiantRepository;

import java.util.List;

public class EtudiantServiceImpl implements IEtudiantService {
    EtudiantRepository etudiantRepository;

    @Override
    public Etudiant ajouterEtudiant(Etudiant et) {
      return  etudiantRepository.save(et);
    }

    @Override
    public void supprimerEtudiant(Etudiant et) {
etudiantRepository.delete(et);
    }

    @Override
    public Etudiant modifierEtudiant(Etudiant et) {
return etudiantRepository.save(et);
    }

    @Override
    public List<Etudiant> getEtudiants() {
       return etudiantRepository.findAll();
    }

    @Override
    public Etudiant getEtudiant(Long id) {
     return etudiantRepository.findById(id).get();
    }

    @Override
    public Etudiant findEtudiant(Long id) {
       return etudiantRepository.findById(id).get();
    }
}
