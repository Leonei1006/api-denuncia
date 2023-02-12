package br.com.apidenuncia.apidenuncia.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class Data implements Serializable {

    private long id;
    private Denunciante denunciantes;
    private Endereco endereco;
    private Denuncia denuncia;
    private BigDecimal latitude;
    private BigDecimal longitude;

    public Data() {
    }

    public Data(Denunciante denunciantes,
                Denuncia denuncia, BigDecimal latitude, BigDecimal longitude) {
        this.denunciantes = denunciantes;
        this.denuncia = denuncia;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Denunciante getDenunciantes() {
        return denunciantes;
    }

    public void setDenunciantes(Denunciante denunciantes) {
        this.denunciantes = denunciantes;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Denuncia getDenuncia() {
        return denuncia;
    }

    public void setDenuncia(Denuncia denuncia) {
        this.denuncia = denuncia;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }
}
