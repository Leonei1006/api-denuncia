package br.com.apidenuncia.apidenuncia.DTOs.endereco;

import br.com.apidenuncia.apidenuncia.domain.Endereco;

public class MapperEnderecoDTO {

    private MapperEnderecoDTO(){}

    public static Endereco fromDTO(EnderecoClientDTO clientDTO){
        LocationsDTO locationsDTO = clientDTO.getResults().get(0).getLocations().get(0);
        return new Endereco(locationsDTO.getStreet(), locationsDTO.getAdminArea6(), locationsDTO.getAdminArea5(),
                locationsDTO.getAdminArea3(), locationsDTO.getAdminArea1(), locationsDTO.getPostalCode());
    }

    public static ConsultaEnderecoDTO fromDomain(Endereco endereco){
        return new ConsultaEnderecoDTO(endereco.getLagradouro(),
                endereco.getBairro(), endereco.getCidade(), endereco.getEstado(), endereco.getPais(), endereco.getCep());
    }
}
