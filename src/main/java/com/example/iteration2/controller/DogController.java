package com.example.iteration2.controller;

import com.example.iteration2.entity.AniEradication;
import com.example.iteration2.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DogController {
    private final DogService dogService;
    
    @Autowired
    public DogController(DogService dogService) {
        this.dogService = dogService;
    }
    
    @GetMapping(path = "api2/dog")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public List<AniEradication> getData(){
        
       return dogService.getInfo(); 
    }
}
