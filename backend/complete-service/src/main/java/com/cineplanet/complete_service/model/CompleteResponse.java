package com.cineplanet.complete_service.model;

public class CompleteResponse {
    private String code;
    private String message;

    public CompleteResponse(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
