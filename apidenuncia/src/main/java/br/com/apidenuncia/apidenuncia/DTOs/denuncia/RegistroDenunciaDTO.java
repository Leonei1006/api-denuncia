package br.com.apidenuncia.apidenuncia.DTOs.denuncia;

import jakarta.validation.constraints.NotBlank;

public class RegistroDenunciaDTO {

    @NotBlank(message = "O campo titulo deve ser preenchido. ")
    private String titulo;
    @NotBlank(message = "O campo descricao deve ser preenchido. ")
    private String descricao;

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
