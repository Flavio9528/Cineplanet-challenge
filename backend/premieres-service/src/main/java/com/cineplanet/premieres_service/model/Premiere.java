package com.cineplanet.premieres_service.model;

public class Premiere {
    private Long id;
    private String imageUrl;
    private String description;

    public Premiere(Long id, String imageUrl, String description) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getDescription() {
        return description;
    }
}
