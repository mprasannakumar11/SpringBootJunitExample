package com.example.mockito.service;

import com.example.mockito.entity.DataEntity;
import com.example.mockito.reposiroty.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    private final MyRepository myRepository;

    @Autowired
    public MyService(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    public String processData(Long id) {

        DataEntity entity = myRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("Entity not found"));

        return "Processed " + entity.getData();
    }
}

