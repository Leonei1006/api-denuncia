package br.com.apidenuncia.apidenuncia.DTOs.denunciante;

import br.com.apidenuncia.apidenuncia.domain.Denunciante;

public class MapperDenuncianteDTO {

    private MapperDenuncianteDTO() { }

    public static Denunciante fromDTO(RegistroDenuncianteDTO dto){
        return new Denunciante(dto.getCpf(), dto.getNome());
    }

    public static ConsultaDenuncianteDTO fromDomain(Denunciante denunciante){
        return new ConsultaDenuncianteDTO(denunciante.getCpf(), denunciante.getNome());
    }
}
