package br.com.apidenuncia.apidenuncia.DTOs.data;

import br.com.apidenuncia.apidenuncia.DTOs.denuncia.MapperDenunciaDTO;
import br.com.apidenuncia.apidenuncia.DTOs.denunciante.MapperDenuncianteDTO;
import br.com.apidenuncia.apidenuncia.domain.Data;

public class MapperDataDTO {

    private MapperDataDTO(){}

    public static Data fromDTO(RegistroDataDTO dto){
        return new Data(MapperDenuncianteDTO.fromDTO(dto.getDenunciante()), MapperDenunciaDTO.fromDTO(dto.getDenuncia()),
                dto.getLatitude(), dto.getLongitude());
    }
}
