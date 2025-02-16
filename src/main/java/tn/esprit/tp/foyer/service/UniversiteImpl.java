package tn.esprit.tp.foyer.service;

import tn.esprit.tp.foyer.Entity.Universite;
import tn.esprit.tp.foyer.repository.UniversiteRepository;
    
import java.util.List;

public class UniversiteImpl implements IUniversiteService{
    UniversiteRepository universiteRepository;
    @Override
    public List<Universite> findAll() {

       return universiteRepository.findAll();
    }

    @Override
    public Universite findById(Long id) {
       return universiteRepository.findById(id).orElse(null);

    }

    @Override
    public Universite save(Universite universite) {
        universiteRepository.save(universite);

    return universite;}

    @Override
    public void delete(Universite universite) {
universiteRepository.delete(universite);

    }

    @Override
    public Universite update(Universite universite) {
        universiteRepository.save(universite);
        return universite;
    }
}
