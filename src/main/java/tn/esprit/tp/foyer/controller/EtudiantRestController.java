package tn.esprit.tp.foyer.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp.foyer.Entity.Chambre;
import tn.esprit.tp.foyer.Entity.Etudiant;
import tn.esprit.tp.foyer.service.IEtudiantService;

import java.util.List;

@RestController
@RequestMapping("/Etudiant")
@Tag(name = "gestion etudiant")
public class EtudiantRestController {
    IEtudiantService etudiantService;

    @GetMapping("/retrieve-etudiants")
    public List<Etudiant> retrieveAll() {
        return etudiantService.getEtudiants();
    }

    @GetMapping("/retrieve-chambre/{idChambre}")
    public Etudiant retrieveById(@PathVariable("idChambre") Long id) {
        return etudiantService.getEtudiant(id);
    }

    @PostMapping("/add-etudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.ajouterEtudiant(etudiant);
    }
    @PutMapping("/update-etudiant")
    public Etudiant updateEtudiant(@RequestBody Etudiant etudiant) {
       return etudiantService.modifierEtudiant(etudiant);
    }
    @DeleteMapping("/delete-chambre/{id}")
    public void deleteEtudiant(@PathVariable("id") Long id) {
       etudiantService.supprimerEtudiant(etudiantService.getEtudiant(id));
    }
}

