package com.meli.exercicio.starwars.exerciciostarwars;


import com.meli.exercicio.starwars.exerciciostarwars.Entity.StarWars;
import com.meli.exercicio.starwars.exerciciostarwars.Model.StarWarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StarWarsController {

    public StarWarsController() {}

    private StarWarsService starWarsService;


    @Autowired
    public StarWarsController(StarWarsService starWarsService) {
        this.starWarsService = starWarsService;
    }


    @GetMapping("/starWars")
    public ResponseEntity<?> getAllStarWars() {
        return ResponseEntity.ok(starWarsService.findAll());
    }

    @GetMapping("/starWars/name/{nome}")
    public ResponseEntity<?> getByName(@PathVariable String nome) {
       StarWars starWars = starWarsService.ByName(nome);

        if(starWars != null) {
            return ResponseEntity.ok(starWars);
        }

        return ResponseEntity.badRequest().build();
    }

    @GetMapping("/starWars/pesquisar/{nome}")
    public ResponseEntity<?> getFoodByName(@PathVariable String nome) {
        List<StarWars> starWars  = starWarsService.findByName(nome);

        if(starWars != null) {
            return ResponseEntity.ok(starWars);
        }

        return ResponseEntity.badRequest().build();
    }
}
