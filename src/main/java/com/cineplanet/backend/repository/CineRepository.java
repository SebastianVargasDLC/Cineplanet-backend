package com.cineplanet.backend.repository;

import com.cineplanet.backend.model.Cine;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CineRepository extends MongoRepository<Cine, ObjectId> {
}
