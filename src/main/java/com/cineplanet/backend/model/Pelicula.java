package com.cineplanet.backend.model;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "peliculas")
public class Pelicula {

    @Id 
    private ObjectId id;
    private String titulo;
    private String genero;
    private int duracionMin;
    private String clasificacion;
    private List<String> idiomas;
    private boolean activo;

    // Getters
    public ObjectId getId(){
        return id;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getGenero(){
        return genero;
    }

    public int getDuracionMin(){
        return duracionMin;
    }

    public String getClasificacion(){
        return clasificacion;
    }

    public List<String> getIdiomas(){
        return idiomas;
    }

    public boolean getActivo(){
        return activo;
    }

    // Setters
    public void setId(ObjectId id){
        this.id = id;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public void setDuracionMin(int duracionMin){
        this.duracionMin = duracionMin;
    }

    public void setClasificacion(String clasificacion){
        this.clasificacion = clasificacion;
    }

    public void setIdiomas(List<String> idiomas){
        this.idiomas = idiomas;
    }

    public void setActivo(boolean activo){
        this.activo = activo;
    }
}
