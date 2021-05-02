package com.example.iteration2.controller;

import com.example.iteration2.entity.AniEradication;
import com.example.iteration2.service.RabbitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RabbitController {
   private final RabbitService rabbitService;

    @Autowired
    public RabbitController(RabbitService rabbitService) {
        this.rabbitService = rabbitService;
    }

    @GetMapping(path = "api2/rabbit")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public List<AniEradication> getData(){

        return rabbitService.getInfo();
    }
}
