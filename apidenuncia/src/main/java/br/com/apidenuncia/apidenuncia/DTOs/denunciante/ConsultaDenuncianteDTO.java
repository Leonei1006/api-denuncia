package br.com.apidenuncia.apidenuncia.DTOs.denunciante;


import java.io.Serializable;

public class ConsultaDenuncianteDTO implements Serializable {

    private String cpf;
    private String nome;

    public ConsultaDenuncianteDTO(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
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
