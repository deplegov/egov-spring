package com.project.gouvernance.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project.gouvernance.model.Tender;

@Repository
public interface TenderRepository extends MongoRepository<Tender, String> {

}
