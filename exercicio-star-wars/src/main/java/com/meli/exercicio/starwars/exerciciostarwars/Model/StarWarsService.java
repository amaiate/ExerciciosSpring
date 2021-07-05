package com.meli.exercicio.starwars.exerciciostarwars.Model;

import com.meli.exercicio.starwars.exerciciostarwars.Entity.StarWars;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StarWarsService {


    private StarWarsRepository starWarsRepository;

    public StarWarsService() {}

    @Autowired
    public StarWarsService(StarWarsRepository starwarsRepository) {
        this.starWarsRepository = starwarsRepository;
    }

    public List<StarWars> findAll() {
        return starWarsRepository.getList();
    }

    public StarWars ByName(String name) {
        return starWarsRepository.byName(name);
    }

    public List<StarWars> findByName(String name) {
        return starWarsRepository.getByName(name);
    }

}
