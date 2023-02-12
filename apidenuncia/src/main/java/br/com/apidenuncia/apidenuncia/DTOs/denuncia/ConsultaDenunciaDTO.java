package br.com.apidenuncia.apidenuncia.DTOs.denuncia;

public class ConsultaDenunciaDTO {

    private String denuncia;
    private String titulo;

    public ConsultaDenunciaDTO(String denuncia, String titulo) {
        this.denuncia = denuncia;
        this.titulo = titulo;
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
