package com.cineplanet.backend.service;

import com.cineplanet.backend.model.Ventas;
import com.cineplanet.backend.repository.VentaRepository;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VentaService {
    private final VentaRepository repository;

    public VentaService (VentaRepository repository) {
        this.repository = repository;
    }

    public Ventas save (Ventas venta){
        return repository.save(venta);
    }

    public List<Ventas> getVentas() { return repository.findAll(); }
    public Optional<Ventas> getVenta(ObjectId id) {
        return repository.findById(id);
    }

}
