package com.project.gouvernance.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.gouvernance.model.Tender;

@Repository
public interface TenderRepository extends MongoRepository<Tender, String> {

    @Query("{'reference': ?0}")
    Optional<Tender> findByReference(String reference);
}
