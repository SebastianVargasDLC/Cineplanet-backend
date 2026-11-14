package com.cineplanet.backend.service;

import com.cineplanet.backend.model.Funcion;
import com.cineplanet.backend.repository.FuncionRepository;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionService {
    private final FuncionRepository repository;

    public FuncionService(FuncionRepository repository) {
        this.repository = repository;
    }

    public Funcion save(Funcion funcion) {
        return repository.save(funcion);
    }
    public List<Funcion> getFunciones() { return repository.findAll(); }
    public Optional<Funcion> getFuncion(ObjectId id) {
        return repository.findById(id);
    }
}
