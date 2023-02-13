package br.com.apidenuncia.apidenuncia.domain;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Denuncia implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String titulo;
    @Column
    private String descricao;

    public Denuncia() {
    }

    public Denuncia(String titulo, String denuncia) {
        this.titulo = titulo;
        this.descricao = denuncia;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
