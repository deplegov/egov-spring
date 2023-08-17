package com.project.gouvernance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.gouvernance.model.Tender;
import com.project.gouvernance.repository.TenderRepository;

@RestController
public class TenderController {
 @Autowired
    private TenderRepository tenderRepo;

    @GetMapping("/tenders")
    public ResponseEntity<?> getAllUser() {
        List<Tender> tenders = tenderRepo.findAll();
        if (tenders.size() > 0)
            return new ResponseEntity<List<Tender>>(tenders, HttpStatus.OK);
        else
            return new ResponseEntity<>("No tender available", HttpStatus.NOT_FOUND);
    }
}
