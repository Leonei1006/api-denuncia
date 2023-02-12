package br.com.apidenuncia.apidenuncia.domain;

import java.io.Serializable;

public class Denunciante implements Serializable {

    private long id;
    private String cpf;
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
