package com.meli.exercicios.linktracker.exerciciolinktracker.Models;

import com.meli.exercicios.linktracker.exerciciolinktracker.Entity.Link;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class LinkRepository {

    private static List<Link> links = new ArrayList<>();


    public Link getLinkId(long id) {
        Optional<Link> linkOptional = links.stream().filter(link -> link.getId() == id).findAny();

        if(linkOptional.isPresent()) {
            return linkOptional.get();
        }

        return null;
    }

    public void addLink(Link link) {
        links.add(link);
    }

    public Link deleteLink(long id) {
        Optional<Link> linkOptional = links.stream().filter(link -> link.getId() == id).findAny();

        if(linkOptional.isPresent()) {
            links.remove(linkOptional.get());
            return linkOptional.get();
        }

        return null;
    }
}
