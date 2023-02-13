package br.com.apidenuncia.apidenuncia.DTOs.endereco;

import java.util.List;

public class ResultsDTO {

    private List<LocationsDTO> locations;

    public List<LocationsDTO> getLocations() {
        return locations;
    }

    public void setLocations(List<LocationsDTO> locations) {
        this.locations = locations;
    }
}
