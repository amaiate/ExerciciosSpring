package com.meli.exercicios.linktracker.exerciciolinktracker.Entity;

public class Link {

    private long id;
    private long redirecionar;
    private String url;
    private String senha;

    public Link(long id, long redirecionar, String url, String senha) {
        this.id = id;
        this.redirecionar = redirecionar;
        this.url = url;
        this.senha = senha;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getRedirecionar() {
        return redirecionar;
    }

    public void setRedirecionar(long redirecionar) {
        this.redirecionar = redirecionar;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
