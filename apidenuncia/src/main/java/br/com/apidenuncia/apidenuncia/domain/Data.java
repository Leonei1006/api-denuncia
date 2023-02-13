package br.com.apidenuncia.apidenuncia.domain;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
public class Data implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne
    private Denunciante denunciantes;
    @OneToOne
    private Endereco endereco;
    @OneToOne
    private Denuncia denuncia;
    @Column(length = 255)
    private BigDecimal latitude;
    @Column(length = 255)
    private BigDecimal longitude;

    public Data() {
    }

    public Data(Denunciante denunciantes, Endereco endereco,
                Denuncia denuncia, BigDecimal latitude, BigDecimal longitude) {
        this.denunciantes = denunciantes;
        this.endereco = endereco;
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
