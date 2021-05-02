package com.example.iteration2.controller;

import com.example.iteration2.entity.AniEradication;
import com.example.iteration2.service.GoatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoatController {

   private final GoatService goatService;
    @Autowired
    public GoatController(GoatService goatService) {
        this.goatService = goatService;
    }
    @GetMapping(path = "api2/goat")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public List<AniEradication> getData(){

        return goatService.getInfo();
    }
}
