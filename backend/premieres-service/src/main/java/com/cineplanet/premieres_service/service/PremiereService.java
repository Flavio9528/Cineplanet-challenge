package com.cineplanet.premieres_service.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.cineplanet.premieres_service.model.Premiere;
import com.cineplanet.premieres_service.repository.PremiereRepository;

@Service
public class PremiereService {

    private final PremiereRepository repository;

    public PremiereService(PremiereRepository repository) {
        this.repository = repository;
    }

    public List<Premiere> getPremieres() {
        return repository.getPremieres();
    }
}