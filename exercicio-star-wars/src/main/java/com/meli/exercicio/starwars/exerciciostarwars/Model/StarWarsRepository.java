package com.meli.exercicio.starwars.exerciciostarwars.Model;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.meli.exercicio.starwars.exerciciostarwars.Entity.StarWars;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class StarWarsRepository {

    private static final File FILE = new File("starwars.json");

    @Autowired
    private ObjectMapper mapper;

    public List<StarWars> getList(){
        List<StarWars> starwars = new ArrayList<>();
        try {
            FileInputStream is = new FileInputStream(FILE);
            TypeReference<List<StarWars>> typeReference = new TypeReference<>() {};
            starwars = mapper.readValue(is, typeReference);
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return starwars;
    }

    public StarWars byName (String name) {
        List<StarWars> foods = this.getList();

        Optional<StarWars> starwarsOptional = foods.stream().filter(food -> food.getName().equals(name)).findAny();

        if(starwarsOptional.isPresent()) {
            return starwarsOptional.get();
        }

        return null;
    }

    public List<StarWars> getByName(String name) {
        List<StarWars> starResponse = new ArrayList<>();
        List<StarWars> starwars = this.getList();

        for (StarWars starWars : starwars) {
            if(starWars.getName().contains(name)) {
                starResponse.add(starWars);
            }
        }

        return starResponse;
    }


}
