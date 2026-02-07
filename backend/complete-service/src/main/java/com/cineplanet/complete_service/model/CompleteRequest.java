package com.cineplanet.complete_service.model;

public class CompleteRequest {
    private String email;
    private String name;
    private String dni;
    private String operationDate;
    private String transactionId;

    public CompleteRequest() {}

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getDni() {
        return dni;
    }

    public String getOperationDate() {
        return operationDate;
    }

    public String getTransactionId() {
        return transactionId;
    }
}
