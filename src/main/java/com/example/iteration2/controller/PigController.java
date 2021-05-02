package com.example.iteration2.controller;

import com.example.iteration2.entity.AniEradication;
import com.example.iteration2.service.PigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PigController {
   private final PigService pigService;

    @Autowired
    public PigController(PigService pigService) {
        this.pigService = pigService;
    }

    @GetMapping(path = "api2/pig")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public List<AniEradication> getData(){

        return pigService.getInfo();
    }
}
