package br.com.apidenuncia.apidenuncia.domain;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Denunciante implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 11)
    private String cpf;
    @Column(length = 255)
    private String nome;

    public Denunciante() { }

    public Denunciante(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
