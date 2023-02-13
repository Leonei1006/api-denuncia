package br.com.apidenuncia.apidenuncia.DTOs.endereco;

import jakarta.persistence.Column;

public class ConsultaEnderecoDTO {

    private String lagradouro;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;
    private String cep;

    public ConsultaEnderecoDTO() {
    }

    public ConsultaEnderecoDTO(String lagradouro, String bairro,
                               String cidade, String estado, String pais, String cep) {
        this.lagradouro = lagradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.cep = cep;
    }

    public String getLagradouro() {
        return lagradouro;
    }

    public void setLagradouro(String lagradouro) {
        this.lagradouro = lagradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
