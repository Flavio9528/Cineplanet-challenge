package com.cineplanet.complete_service.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cineplanet.complete_service.model.CompleteRequest;
import com.cineplanet.complete_service.model.CompleteResponse;
import com.cineplanet.complete_service.service.CompleteService;

@RestController
@RequestMapping("/complete")

public class CompleteController {
    private final CompleteService completeService;

    public CompleteController(CompleteService completeService) {
        this.completeService = completeService;
    }

    @PostMapping
    public CompleteResponse complete(@RequestBody CompleteRequest request) {
        return completeService.completePurchase(request);
    }
}
