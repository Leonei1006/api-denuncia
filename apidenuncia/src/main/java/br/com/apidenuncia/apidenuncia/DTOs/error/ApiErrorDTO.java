package br.com.apidenuncia.apidenuncia.DTOs.error;

import java.io.Serializable;

public class ApiErrorDTO implements Serializable {

    private static final long serialVersionUID = 4518050775670811465L;
    private String titulo;
    private int status;
    private String detalhes;
    private long timeStamp;

    public ApiErrorDTO(String titulo, int status, String detalhes, long timeStamp) {
        setTitulo(titulo);
        setStatus(status);
        setDetalhes(detalhes);
        setTimeStamp(timeStamp);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }



}