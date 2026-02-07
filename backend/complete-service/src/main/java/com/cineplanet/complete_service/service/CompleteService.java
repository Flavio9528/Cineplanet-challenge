package com.cineplanet.complete_service.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.cineplanet.complete_service.model.CompleteRequest;
import com.cineplanet.complete_service.model.CompleteResponse;

@Service
public class CompleteService {
    private static final Logger log = LoggerFactory.getLogger(CompleteService.class);

    public CompleteResponse completePurchase(CompleteRequest request) {

        log.info("Compra recibida");
        log.info("Email: {}", request.getEmail());
        log.info("Nombre: {}", request.getName());
        log.info("DNI: {}", request.getDni());
        log.info("OperationDate: {}", request.getOperationDate());
        log.info("TransactionId: {}", request.getTransactionId());

        return new CompleteResponse("0", "Compra exitosa");
    }
}
