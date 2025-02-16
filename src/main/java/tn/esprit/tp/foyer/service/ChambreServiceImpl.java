package tn.esprit.tp.foyer.service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.tp.foyer.Entity.Chambre;
import tn.esprit.tp.foyer.Entity.TypeChambre;
import tn.esprit.tp.foyer.repository.ChambreRepository;

import java.util.List;


@Service
@AllArgsConstructor
@Slf4j
public class ChambreServiceImpl implements IChambreService {

    ChambreRepository chambreRepository;



    @Override
   // @Scheduled(fixedRate = 60000)
    @Transactional
    public List<Chambre> getChambres() {
        List<Chambre> list=  chambreRepository.findAll();
        for (Chambre chambre : list) {
            log.info(chambre.toString());

        }
        return list;
    }

    @Override
    public Chambre getChambre(Long id) {
        Chambre chambre = chambreRepository.getById(id);
        if (chambre != null) {    log.info("Chambre trouvée : " + chambre.toString());}
        else {    log.warn("Aucune chambre trouvée avec l'ID : " + id);}
     return chambre;


    }

    @Override
    public Chambre addChambre(Chambre chambre) {
        chambreRepository.save(chambre);
        return chambre;
    }

    @Override
    public Chambre updateChambre(Chambre chambre) {
        chambreRepository.save(chambre);
        return chambre;
    }

    @Override
    public void deleteChambre(Long id) {
chambreRepository.deleteById(id);
    }

    @Override
    public Chambre getChambreById(Long id) {
        chambreRepository.findById(id);
        return chambreRepository.findById(id).get();
    }

    @Override
    public List<Chambre> retrieveAllChambreTypeChambre(TypeChambre typeChambre) {
        return chambreRepository.findAllByTypeChambre(typeChambre);
    }

    @Override
    public Chambre retriveChambreByNumeroChambre(long numeroChambre) {
        return chambreRepository.findByNumeroChambre(numeroChambre);
    }

    @Override
    public List<Chambre> findAllByNumeroChambreBetween(long from, long to) {
        return chambreRepository.findByNumeroChambreBetween(from,to);
    }

    @Override
    public Chambre trouverChselonEt(long cin) {
        return chambreRepository.trouverChselonEt(cin );
    }
}
