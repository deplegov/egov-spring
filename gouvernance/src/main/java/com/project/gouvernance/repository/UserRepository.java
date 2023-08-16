package com.project.gouvernance.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project.gouvernance.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
