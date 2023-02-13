package br.com.apidenuncia.apidenuncia.DTOs.data;

import br.com.apidenuncia.apidenuncia.DTOs.denuncia.ConsultaDenunciaDTO;
import br.com.apidenuncia.apidenuncia.DTOs.denunciante.ConsultaDenuncianteDTO;
import br.com.apidenuncia.apidenuncia.DTOs.endereco.ConsultaEnderecoDTO;

import java.math.BigDecimal;

public class ConsultaDataDTO {

    private long id;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private ConsultaDenuncianteDTO denunciante;
    private ConsultaDenunciaDTO denuncia;
    private ConsultaEnderecoDTO endereco;

    public ConsultaDataDTO() {
    }

    public ConsultaDataDTO(long id,
                           BigDecimal latitude,
                           BigDecimal longitude,
                           ConsultaDenuncianteDTO denunciante,
                           ConsultaDenunciaDTO denuncia,
                           ConsultaEnderecoDTO endereco) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.denunciante = denunciante;
        this.denuncia = denuncia;
        this.endereco = endereco;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public ConsultaDenuncianteDTO getDenunciante() {
        return denunciante;
    }

    public void setDenunciante(ConsultaDenuncianteDTO denunciante) {
        this.denunciante = denunciante;
    }

    public ConsultaDenunciaDTO getDenuncia() {
        return denuncia;
    }

    public void setDenuncia(ConsultaDenunciaDTO denuncia) {
        this.denuncia = denuncia;
    }

    public ConsultaEnderecoDTO getEndereco() {
        return endereco;
    }

    public void setEndereco(ConsultaEnderecoDTO endereco) {
        this.endereco = endereco;
    }
}
