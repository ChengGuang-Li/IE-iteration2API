package com.example.iteration2.controller;


import com.example.iteration2.entity.AniEradication;
import com.example.iteration2.service.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FoxController {
    private final FoxService foxService;

    @Autowired
    public FoxController(FoxService foxService) {
        this.foxService = foxService;
    }

    @GetMapping(path = "api2/fox")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public List<AniEradication> getData(){

        return foxService.getInfo();
    }
}
