package com.cineplanet.premieres_service.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cineplanet.premieres_service.model.Premiere;
import com.cineplanet.premieres_service.service.PremiereService;

@RestController
@RequestMapping("/premieres")

public class PremiereController {
    private final PremiereService premiereService;

    public PremiereController(PremiereService premiereService) {
        this.premiereService = premiereService;
    }

    @GetMapping
    public List<Premiere> getPremieres() {
        return premiereService.getPremieres();
    }
}
