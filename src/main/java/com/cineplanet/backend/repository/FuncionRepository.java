package com.cineplanet.backend.repository;

import com.cineplanet.backend.model.Funcion;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionRepository extends MongoRepository<Funcion, ObjectId> {
}
