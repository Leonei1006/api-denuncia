package br.com.apidenuncia.apidenuncia.DTOs.denuncia;

public class ConsultaDenunciaDTO {

    private String titulo;
    private String descricao;

    public ConsultaDenunciaDTO(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
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