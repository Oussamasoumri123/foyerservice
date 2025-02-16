package tn.esprit.tp.foyer.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tp.foyer.Entity.Bloc;

import tn.esprit.tp.foyer.service.IblocService;

import java.util.List;

@RestController
@RequestMapping("/bloc")
@Tag(name = "gestion bloc")
public class BlocRestController {
    @Autowired
    IblocService blocService;
    @PostMapping("/add-Bloc")
    public Bloc addBloc(@RequestBody Bloc bloc) {
        blocService.save(bloc);
        return bloc;
    }
    @GetMapping("/retrieve-bloc")
    public List<Bloc> findAll() {
        List<Bloc> blocs=blocService.findAll();
        return blocs;
    }

    @GetMapping("/retrieve-chambre/{idBloc}")
    public Bloc retrieveById(@PathVariable("idBloc") Long id) {
        return blocService.getBlocById(id);
    }


    @PutMapping("/update-Bloc")


    public Bloc updateBloc(@RequestBody Bloc bloc) {
        return blocService.update(bloc);
    }
    @DeleteMapping("/delete-Bloc/{id}")
    public void deleteBloc(@PathVariable("id") Long id) {
        blocService.delete(blocService.getBlocById(id));
    }
}
