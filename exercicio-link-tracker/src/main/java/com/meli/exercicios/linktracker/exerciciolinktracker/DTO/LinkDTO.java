package com.meli.exercicios.linktracker.exerciciolinktracker.DTO;

public class LinkDTO {

    private Long linkId;
    private String senha;

    public LinkDTO(Long linkId, String senha) {
        this.linkId = linkId;
        this.senha = senha;
    }

    public Long getLinkId() {
        return linkId;
    }

    public void setLinkId(Long linkId) {
        this.linkId = linkId;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
