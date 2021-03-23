package com.cosmos.repository;

import com.cosmos.model.IdSequence;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdSequenceRepository extends MongoRepository<IdSequence, String> {
    IdSequence findTopByOrderByIdDesc();
}
