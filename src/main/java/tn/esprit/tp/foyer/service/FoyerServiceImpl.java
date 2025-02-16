package tn.esprit.tp.foyer.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tp.foyer.Entity.Foyer;
import tn.esprit.tp.foyer.repository.FoyerRepository;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class FoyerServiceImpl implements IFoyerService{

    FoyerRepository foyerRepository;

    @Override
    public List<Foyer> findAll() {
     return foyerRepository.findAll();
    }

    @Override
    public Foyer GetFoyer(Long id) {
        return foyerRepository.findById(id).get();
    }


    @Override
    public Foyer save(Foyer foyer) {
return foyerRepository.save(foyer);
    }

    @Override
    public void delete(Foyer foyer) {
foyerRepository.delete(foyer);
    }

    @Override
    public Foyer update(Foyer foyer) {
        foyerRepository.save(foyer);
        return foyer;
    }
}
