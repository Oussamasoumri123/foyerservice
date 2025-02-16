package tn.esprit.tp.foyer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tp.foyer.Entity.Bloc;
import tn.esprit.tp.foyer.repository.BlocRepository;

import java.util.List;
import java.util.Optional;
@Service
public class BlocServiceImpl implements IblocService{
    @Autowired
    BlocRepository blocRepository;
    @Override
    public List<Bloc> findAll() {
        return blocRepository.findAll();
    }

    @Override
    public Optional<Bloc> findById(long id) {
     return blocRepository.findById(id);
    }

    @Override
    public void save(Bloc bloc) {
blocRepository.save(bloc);
    }

    @Override
    public void delete(Bloc bloc) {
blocRepository.delete(bloc);
    }

    @Override
    public Bloc update(Bloc bloc) {
       blocRepository.save(bloc);
       return bloc;
    }

    @Override
    public Bloc getBlocById(long id) {
       blocRepository.findById(id);
       return blocRepository.findById(id).get();
    }
}
