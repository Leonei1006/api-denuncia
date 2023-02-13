package br.com.apidenuncia.apidenuncia.DTOs.data;

import br.com.apidenuncia.apidenuncia.DTOs.denuncia.MapperDenunciaDTO;
import br.com.apidenuncia.apidenuncia.DTOs.denunciante.MapperDenuncianteDTO;
import br.com.apidenuncia.apidenuncia.DTOs.endereco.EnderecoClientDTO;
import br.com.apidenuncia.apidenuncia.DTOs.endereco.MapperEnderecoDTO;
import br.com.apidenuncia.apidenuncia.domain.Data;

public class MapperDataDTO {

    private MapperDataDTO(){}

    public static Data fromDTO(RegistroDataDTO dto, EnderecoClientDTO clientDTO){
        return new Data(MapperDenuncianteDTO.fromDTO(dto.getDenunciante()), MapperEnderecoDTO.fromDTO(clientDTO),
                MapperDenunciaDTO.fromDTO(dto.getDenuncia()),
                dto.getLatitude(), dto.getLongitude());
    }

    public static ConsultaDataDTO fromEntity(Data data){
        return new ConsultaDataDTO(data.getId(),data.getLatitude(),
                data.getLongitude(), MapperDenuncianteDTO.fromDomain(data.getDenunciantes()),
                        MapperDenunciaDTO.fromDomain(data.getDenuncia()), MapperEnderecoDTO.fromDomain(data.getEndereco()));
    }
}
