package tn.esprit.tp.foyer.service;

import tn.esprit.tp.foyer.Entity.Universite;

import java.util.List;

public interface IUniversiteService {
    List<Universite> findAll();
    Universite findById(Long id);
    Universite save(Universite universite);
    void delete(Universite universite);
    Universite update(Universite universite);

}
