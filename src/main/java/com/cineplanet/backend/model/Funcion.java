package com.cineplanet.backend.model;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "funciones")
public class Funcion {

    @Id
    private ObjectId id;

    private ObjectId peliculaId;
    private ObjectId cineId;
    private int numeroSala;
    private Date fechaHora;
    private double precio;
    private boolean activo;
    private List<Asiento> asientos;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public ObjectId getPeliculaId() {
        return peliculaId;
    }

    public void setPeliculaId(ObjectId peliculaId) {
        this.peliculaId = peliculaId;
    }

    public ObjectId getCineId() {
        return cineId;
    }

    public void setCineId(ObjectId cineId) {
        this.cineId = cineId;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public List<Asiento> getAsientos() {
        return asientos;
    }

    public void setAsientos(List<Asiento> asientos) {
        this.asientos = asientos;
    }
}
