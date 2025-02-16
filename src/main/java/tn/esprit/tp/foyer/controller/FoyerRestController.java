package tn.esprit.tp.foyer.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tn.esprit.tp.foyer.Entity.Foyer;
import tn.esprit.tp.foyer.service.IFoyerService;

import java.util.List;

@RequestMapping("/Foyer")
@RestController
@Tag(name = "gestion Foyer")
@AllArgsConstructor
public class FoyerRestController {

    IFoyerService foyerService;
    @GetMapping("/retrieve-foyer")
    public List<Foyer> retrieveAll() {
        return foyerService.findAll();
    }

    @GetMapping("/retrieve-foyer/{idFoyer}")
    public Foyer retrieveById(@PathVariable("idFoyer") Long id) {
       return foyerService.GetFoyer(id);
    }
//Ex1 cas1
    @PostMapping("/add-Foyer")
    public Foyer addFoyer(@RequestBody Foyer foyer) {
        return foyerService.save(foyer);
    }
    @PutMapping("/update-Foyer")
    public Foyer updateFoyer(@RequestBody Foyer foyer) {
        return foyerService.update(foyer);
    }
    @DeleteMapping("/delete-Foyer/{id}")
    public void deleteFoyer(@PathVariable("id") Long id) {
        foyerService.delete(foyerService.GetFoyer(id));
    }
}
