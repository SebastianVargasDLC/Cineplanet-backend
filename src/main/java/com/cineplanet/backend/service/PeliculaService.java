package com.cineplanet.backend.service;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import com.cineplanet.backend.model.Pelicula;
import com.cineplanet.backend.repository.PeliculaRepository;

@Service 
public class PeliculaService {

    private final PeliculaRepository repository;

    public PeliculaService(PeliculaRepository repository) {
        this.repository = repository;
    }

    public Pelicula save(Pelicula pelicula) {
        return repository.save(pelicula);
    }

    public List<Pelicula> getPeliculas() {
        return repository.findAll();
    }

    public Optional<Pelicula> getPelicula(ObjectId id) {
        return repository.findById(id);
    }

    public Pelicula update(ObjectId id, Pelicula pelicula) {
        Pelicula peliculaActual = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Película no encontrada"));

        peliculaActual.setTitulo(pelicula.getTitulo());
        peliculaActual.setGenero(pelicula.getGenero());
        peliculaActual.setDuracionMin(pelicula.getDuracionMin());
        peliculaActual.setClasificacion(pelicula.getClasificacion());
        peliculaActual.setIdiomas(pelicula.getIdiomas());
        peliculaActual.setActivo(pelicula.getActivo());

        return repository.save(peliculaActual);
    }
}
