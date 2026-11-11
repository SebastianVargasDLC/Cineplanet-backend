package com.cineplanet.backend.model;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "ventas")
public class Ventas {
    
    @Id 
    private ObjectId id;
    private Cliente cliente;
    private Pelicula pelicula;
    private Cine cine;
    private int numeroSala;
    private Date fechaVenta;
    private Entrada entradas;
    private int total;
    private String estado;

    public ObjectId getId() {
        return id;
    }
    public void setId(ObjectId id) {
        this.id = id;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Pelicula getPelicula() {
        return pelicula;
    }
    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
    public Cine getCine() {
        return cine;
    }
    public void setCine(Cine cine) {
        this.cine = cine;
    }
    public int getNumeroSala() {
        return numeroSala;
    }
    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }
    public Date getFechaVenta() {
        return fechaVenta;
    }
    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
    public Entrada getEntradas() {
        return entradas;
    }
    public void setEntradas(Entrada entradas) {
        this.entradas = entradas;
    }
    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
