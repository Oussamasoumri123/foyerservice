package tn.esprit.tp.foyer.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp.foyer.Entity.Chambre;
import tn.esprit.tp.foyer.Entity.Universite;
import tn.esprit.tp.foyer.service.IUniversiteService;

import java.util.List;

@RestController
@RequestMapping("/Universite")
@Tag(name = "gestion universite")
public class UniversiteRestController {
    IUniversiteService universiteService;

    @GetMapping("/retrieve-universites")
    public List<Universite> retrieveAll() {
        return universiteService.findAll();
    }

    @GetMapping("/retrieve-universite/{id}")
    public Universite retrieveById(@PathVariable("id") Long id) {
        return universiteService.findById(id);
    }

    @PostMapping("/add-universite")
    public Universite addUniversite(@RequestBody Universite universite) {
        return universiteService.save(universite);
    }
    @PutMapping("/update-universite")
    public Universite updateUniversite(@RequestBody Universite universite) {
        return universiteService.save(universite);
    }
    @DeleteMapping("/delete-chambre/{id}")
    public void deleteUniversite(@PathVariable("id") Long id) {
       universiteService.delete(universiteService.findById(id));
    }
}
