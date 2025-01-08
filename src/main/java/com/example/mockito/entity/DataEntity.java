package com.example.mockito.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class DataEntity {
    @Id
    private Long id;
    private String data;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

