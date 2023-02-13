package br.com.apidenuncia.apidenuncia.DTOs.denunciante;


import java.io.Serializable;

public class ConsultaDenuncianteDTO implements Serializable {

    private String nome;
    private String cpf;

    public ConsultaDenuncianteDTO(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
