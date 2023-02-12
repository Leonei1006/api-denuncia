package br.com.apidenuncia.apidenuncia.domain;

import java.io.Serializable;

public class Denuncia implements Serializable {

    private long id;
    private String denuncia;
    private String titulo;

    public Denuncia() {
    }

    public Denuncia(String denuncia, String titulo) {
        this.denuncia = denuncia;
        this.titulo = titulo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDenuncia() {
        return denuncia;
    }

    public void setDenuncia(String denuncia) {
        this.denuncia = denuncia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
