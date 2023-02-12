package br.com.apidenuncia.apidenuncia.DTOs.denuncia;

import jakarta.validation.constraints.NotBlank;

public class RegistroDenunciaDTO {

    @NotBlank(message = "O campo denuncia deve ser preenchido. ")
    private String denuncia;
    @NotBlank(message = "O campo titulo deve ser preenchido. ")
    private String titulo;

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
