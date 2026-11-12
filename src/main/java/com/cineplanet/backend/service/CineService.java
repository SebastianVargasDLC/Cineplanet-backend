package com.cineplanet.backend.service;

import com.cineplanet.backend.model.Cine;
import com.cineplanet.backend.repository.CineRepository;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CineService {
    private final CineRepository repository;

    public CineService(CineRepository repository) {
        this.repository = repository;
    }

    public Cine save(Cine cine) {
        return repository.save(cine);
    }

    public List<Cine> getCines() { return repository.findAll(); }
    public Optional<Cine> getCine(ObjectId id) {
        return repository.findById(id);
    }
}
