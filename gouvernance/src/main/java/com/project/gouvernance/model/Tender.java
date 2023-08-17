package com.project.gouvernance.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "tender")
public class Tender {
    @Id
    private String id;
    private String reference;
    private String title;
    private String description;
    private List<String> critere;
    private Date dateEmission;
    private Date dateLimit;
}
