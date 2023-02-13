package br.com.apidenuncia.apidenuncia.controllers;

import br.com.apidenuncia.apidenuncia.DTOs.data.ConsultaDataDTO;
import br.com.apidenuncia.apidenuncia.DTOs.data.MapperDataDTO;
import br.com.apidenuncia.apidenuncia.DTOs.data.RegistroDataDTO;
import br.com.apidenuncia.apidenuncia.DTOs.endereco.EnderecoClientDTO;
import br.com.apidenuncia.apidenuncia.domain.Data;
import br.com.apidenuncia.apidenuncia.proxy.EnderecoClient;
import br.com.apidenuncia.apidenuncia.service.DataService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "denúncias" , description = "endPoint para informações relacioandas a denúncias." )
@RestController
@RequestMapping("/v1/denuncias")
public class DenunciaController {

    @Autowired
    private DataService service;

    @Operation(description = "cria uma nova denúncia", tags = "denúncias")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "create", content = @Content(mediaType = "application/jason",
                    schema = @Schema(implementation = ConsultaDataDTO.class)))
    })
    @PostMapping
    public ResponseEntity<ConsultaDataDTO> create(@Valid @RequestBody RegistroDataDTO dto){
        EnderecoClientDTO clientDTO = EnderecoClient.get(dto.getLatitude(), dto.getLongitude());
        Data data = MapperDataDTO.fromDTO(dto, clientDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(MapperDataDTO.fromEntity(service.create(data)));
    }

    @Operation(description = "atualiza uma denúncia ja existente", tags = "denúncias")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "ok", content = @Content(mediaType = "application/jason",
                    schema = @Schema(implementation = ConsultaDataDTO.class)))
    })
    @PutMapping("{id}")
    public ResponseEntity<ConsultaDataDTO> update(@Valid @RequestBody RegistroDataDTO dto, @PathVariable long id){
        EnderecoClientDTO clientDTO = EnderecoClient.get(dto.getLatitude(), dto.getLongitude());
        Data data = MapperDataDTO.fromDTO(dto, clientDTO);
        return ResponseEntity.status(HttpStatus.OK).body(MapperDataDTO.fromEntity(service.updateData(data, id)));
    }

    @Operation(description = "deleta uma denúncia existente no sistema", tags = "denúncias")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "noContent", content = @Content(mediaType = "application/jason",
                    schema = @Schema(implementation = ConsultaDataDTO.class)))
    })
    @DeleteMapping("{id}")
    public ResponseEntity<ConsultaDataDTO> delete(@PathVariable long id){
        service.deleteData(id);
        return ResponseEntity.noContent().build();
    }

    @Operation(description = "busca uma denúncia por id", tags = "denúncias")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "ok", content = @Content(mediaType = "application/jason",
                    schema = @Schema(implementation = ConsultaDataDTO.class)))
    })
    @GetMapping("{id}")
    public ResponseEntity<ConsultaDataDTO> get(@PathVariable long id){
        return ResponseEntity.status(HttpStatus.OK).body(MapperDataDTO.fromEntity(service.getData(id)));
    }

    @Operation(description = "busca todas as denúcias existentes", tags = "denúncias")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "ok", content = @Content(mediaType = "application/jason",
                    schema = @Schema(implementation = ConsultaDataDTO.class)))
    })
    @GetMapping
    public ResponseEntity<List<ConsultaDataDTO>> getAll(){
        List<Data> dataList = service.getDataAll();
        List<ConsultaDataDTO> dto = dataList.stream().map(i -> MapperDataDTO.fromEntity(i)).toList();
        return ResponseEntity.status(HttpStatus.OK).body(dto);
    }
}
