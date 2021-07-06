package com.meli.exercicios.linktracker.exerciciolinktracker.Models;

import com.meli.exercicios.linktracker.exerciciolinktracker.DTO.LinkDTO;
import com.meli.exercicios.linktracker.exerciciolinktracker.Entity.Link;
import com.meli.exercicios.linktracker.exerciciolinktracker.Exceptions.LinkInvalidoException;
import com.meli.exercicios.linktracker.exerciciolinktracker.Forms.LinkForm;
import com.meli.exercicios.linktracker.exerciciolinktracker.Utils.Conversor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LinkService {


    private LinkRepository linkRepository;

    public LinkService() {
    }

    @Autowired
    public LinkService(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    public String redirecionar(long id, String senha) {
        Link link = linkRepository.getLinkId(id);

        if(link == null || senha == null || senha == "" || !link.getSenha().equals(senha)) {
            throw new LinkInvalidoException("Esse link está incorreto");
        }

        long redirecionar = 1l;
        redirecionar += link.getRedirecionar();
        link.setRedirecionar(redirecionar);

        return link.getUrl();
    }

    public long contador(long id) {
        Link link = linkRepository.getLinkId(id);

        if(link == null) {
            throw new LinkInvalidoException("Esse link está incorreto");
        }

        return link.getRedirecionar();
    }

    public LinkDTO criar(LinkForm linkForm) {
        Link link = Conversor.linkFormToEntity(linkForm);

        linkRepository.addLink(link);

        return Conversor.linkEntityToDTO(link);
    }

    public LinkDTO invalidar(long id) throws Exception {
        Link link = linkRepository.deleteLink(id);

        if(link == null) {
            throw new Exception("Link inválido!");
        }

        return Conversor.linkEntityToDTO(link);
    }
}
