package com.cineplanet.backend.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cineplanet.backend.model.Pelicula;

@Repository 
public interface PeliculaRepository extends MongoRepository<Pelicula, ObjectId>{
}
