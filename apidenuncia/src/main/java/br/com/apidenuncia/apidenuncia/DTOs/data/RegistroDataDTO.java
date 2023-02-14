package br.com.apidenuncia.apidenuncia.DTOs.data;

import br.com.apidenuncia.apidenuncia.DTOs.denuncia.RegistroDenunciaDTO;
import br.com.apidenuncia.apidenuncia.DTOs.denunciante.RegistroDenuncianteDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public class RegistroDataDTO {

    @NotNull(message = "O campo latitude deve ser preenchido!")
    @Min(value = -90, message = "Latitude inválida!")
    @Max(value = 90, message = "Latitude inválida!")
    private BigDecimal latitude;

    @Min(value = -180, message = "Longitude inválida!")
    @Max(value = 180, message = "Longitude inválida!")
    @NotNull(message = "O campo longitude deve ser preenchido!")
    private BigDecimal longitude;
    @Valid
    private RegistroDenuncianteDTO denunciante;
    @Valid
    private RegistroDenunciaDTO denuncia;

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

    public RegistroDenuncianteDTO getDenunciante() {
        return denunciante;
    }

    public void setDenunciante(RegistroDenuncianteDTO denunciante) {
        this.denunciante = denunciante;
    }

    public RegistroDenunciaDTO getDenuncia() {
        return denuncia;
    }

    public void setDenuncia(RegistroDenunciaDTO denuncia) {
        this.denuncia = denuncia;
    }
}
