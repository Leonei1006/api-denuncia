package br.com.apidenuncia.apidenuncia.DTOs.denunciante;

import jakarta.validation.constraints.NotBlank;

import java.io.Serializable;

public class RegistroDenuncianteDTO implements Serializable {

    @NotBlank(message = "O campo CPF deve ser preenchido. ")
    private String cpf;
    @NotBlank(message = "O campo nome deve ser preenchido.")
    private String nome;

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
