package br.com.apidenuncia.apidenuncia.DTOs.denuncia;

import br.com.apidenuncia.apidenuncia.domain.Denuncia;

public class MapperDenunciaDTO {

    private MapperDenunciaDTO() { }

    public static Denuncia fromDTO(RegistroDenunciaDTO dto){
        return new Denuncia(dto.getDescricao(), dto.getTitulo());
    }

    public static ConsultaDenunciaDTO fromDomain(Denuncia denuncia){
        return new ConsultaDenunciaDTO(denuncia.getDescricao(),denuncia.getTitulo());
    }
}
