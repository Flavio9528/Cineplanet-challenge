package com.cineplanet.premieres_service.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.cineplanet.premieres_service.model.Premiere;

@Service

public class PremiereService {
    public List<Premiere> getPremieres() {
        return List.of(
            new Premiere(1L, "https://image1.jpg", "Estreno 1"),
            new Premiere(2L, "https://image2.jpg", "Estreno 2"),
            new Premiere(3L, "https://image3.jpg", "Estreno 3")
        );
    }
}
