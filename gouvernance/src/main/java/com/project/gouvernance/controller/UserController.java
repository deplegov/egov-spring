package com.project.gouvernance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.gouvernance.model.User;
import com.project.gouvernance.repository.UserRepository;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepo;

    @GetMapping("/users")
    public ResponseEntity<?> getAllUser() {
        List<User> users = userRepo.findAll();
        if (users.size() > 0)
            return new ResponseEntity<List<User>>(users, HttpStatus.OK);
        else
            return new ResponseEntity<>("No user available", HttpStatus.NOT_FOUND);
    }
}
