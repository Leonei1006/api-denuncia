package br.com.apidenuncia.apidenuncia.DTOs.endereco;

import java.util.List;

public class EnderecoClientDTO {

    private List<ResultsDTO> results;

    public List<ResultsDTO> getResults() {
        return results;
    }

    public void setResults(List<ResultsDTO> results) {
        this.results = results;
    }
}
