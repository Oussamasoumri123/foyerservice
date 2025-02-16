package tn.esprit.tp.foyer.service;

import tn.esprit.tp.foyer.Entity.Chambre;
import tn.esprit.tp.foyer.Entity.TypeChambre;

import java.util.List;
import java.util.Optional;

public interface IChambreService {

    List<Chambre> getChambres();
    Chambre getChambre(Long id);
    Chambre addChambre(Chambre chambre);
    Chambre updateChambre(Chambre chambre);
    void deleteChambre(Long id);
    Chambre getChambreById(Long id);
    public List<Chambre> retrieveAllChambreTypeChambre(TypeChambre typeChambre);
    public Chambre retriveChambreByNumeroChambre(long numeroChambre);
    List<Chambre> findAllByNumeroChambreBetween(long from, long to);
    Chambre trouverChselonEt(long cin);
}
