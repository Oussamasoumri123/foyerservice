package tn.esprit.tp.foyer.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp.foyer.Entity.Chambre;
import tn.esprit.tp.foyer.Entity.TypeChambre;
import tn.esprit.tp.foyer.service.IChambreService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/chambre")
@Tag(name = "gestion Chambre")
public class ChambreRestController {
    IChambreService chambreService;

    @GetMapping("/retrieve-chambers")
    public List<Chambre> retrieveAll() {
        return chambreService.getChambres();
    }

    @GetMapping("/retrieve-chambre/{idChambre}")
    public Chambre retrieveById(@PathVariable("idChambre") Long id) {
        return chambreService.getChambreById(id);
    }

    @PostMapping("/add-chambre")
    public Chambre addChambre(@RequestBody Chambre chambre) {
        return chambreService.addChambre(chambre);
    }
    @PutMapping("/update-chambre")
    public Chambre updateChambre(@RequestBody Chambre chambre) {
        return chambreService.updateChambre(chambre);
    }
    @DeleteMapping("/delete-chambre/{id}")
    public void deleteChambre(@PathVariable("id") Long id) {
        chambreService.deleteChambre(id);
    }
    @GetMapping("/retrive-Chambre-BY-TypeChambre/{typeChambre}")
    public List<Chambre> retriveChambreByTypeChambre(@PathVariable TypeChambre typeChambre) {
       return chambreService.retrieveAllChambreTypeChambre(typeChambre);
    }
    @GetMapping("/retrive-CHambre-By-NumeroChambre/{numeroChambre}")
    public Chambre retriveChambreByNumeroChambre(@PathVariable long numeroChambre) {
      return  chambreService.retriveChambreByNumeroChambre(numeroChambre);
    }
    @GetMapping("/retrive-Chambre-By-NumeroChambre/between/{from}/{to}")
    public List<Chambre> retriveChambreBetween(@PathVariable long from, @PathVariable long to) {
        return chambreService.findAllByNumeroChambreBetween(from, to);
    }
    @GetMapping("/retrivechambrebycin")
    public Chambre trouverChselonEt( @PathVariable long cin){
        return chambreService.trouverChselonEt(cin);
    }
}