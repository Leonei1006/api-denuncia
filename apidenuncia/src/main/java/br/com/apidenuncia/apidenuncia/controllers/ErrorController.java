package br.com.apidenuncia.apidenuncia.controllers;

import br.com.apidenuncia.apidenuncia.DTOs.error.ApiErrorDTO;
import br.com.apidenuncia.apidenuncia.exceptions.ResourceNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@ControllerAdvice
public class ErrorController {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleMethodArgumentNotValidException(MethodArgumentNotValidException rnfe, HttpServletRequest request){
        List<ApiErrorDTO> listaErrorDetalhes = new ArrayList<>();
        List<FieldError> fieldErrors = rnfe.getBindingResult().getFieldErrors();

        fieldErrors.forEach(
                e -> {
                    ApiErrorDTO detalhes = new ApiErrorDTO("Requisição inválida!", HttpStatus.BAD_REQUEST.value(), e.getDefaultMessage(), new Date().getTime());
                    listaErrorDetalhes.add(detalhes);
                });
        return new ResponseEntity<>(listaErrorDetalhes, null, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> handleResourceNotFoundException(ResourceNotFoundException rnfe, HttpServletRequest request) {
        ApiErrorDTO errorDTO = new ApiErrorDTO("Recurso não encontrado", HttpStatus.NOT_FOUND.value(),rnfe.getMessage(),  new Date().getTime());
        return new ResponseEntity<>(errorDTO, null, HttpStatus.NOT_FOUND);
    }

}
