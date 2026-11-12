package com.cineplanet.backend.repository;

import com.cineplanet.backend.model.Ventas;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VentaRepository extends MongoRepository<Ventas, ObjectId> {
}
