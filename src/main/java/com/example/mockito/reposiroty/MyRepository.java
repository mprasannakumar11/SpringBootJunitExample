package com.example.mockito.reposiroty;

import com.example.mockito.entity.DataEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyRepository extends JpaRepository<DataEntity, Long> {
}

