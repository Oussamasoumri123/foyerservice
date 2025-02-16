package tn.esprit.tp.foyer.service;

import tn.esprit.tp.foyer.Entity.Bloc;

import java.util.List;
import java.util.Optional;

public interface IblocService {
    List<Bloc> findAll();
    Optional<Bloc> findById(long id);
    void save(Bloc bloc);
    void delete(Bloc bloc);
    Bloc update(Bloc bloc);
    Bloc getBlocById(long id);
}
