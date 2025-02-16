package tn.esprit.tp.foyer.service;

import tn.esprit.tp.foyer.Entity.Foyer;

import java.util.List;
import java.util.Optional;

public interface IFoyerService {
    List<Foyer> findAll();
    Foyer GetFoyer(Long id);
    Foyer save(Foyer foyer);
    void delete(Foyer foyer);
    Foyer update(Foyer foyer);

}
