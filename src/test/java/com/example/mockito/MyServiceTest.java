package com.example.mockito;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;
import com.example.mockito.entity.DataEntity;
import com.example.mockito.reposiroty.MyRepository;
import com.example.mockito.service.MyService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class MyServiceTest {

    @Mock
    private MyRepository myRepository;

    @InjectMocks
    private MyService myService;

    private DataEntity dataEntity;

    @BeforeEach
    public void setUp() {
        dataEntity = new DataEntity();
        dataEntity.setId(1L);
        dataEntity.setData("Sample Data");
    }

    @Test
    public void testProcessData() {
        when(myRepository.findById(1L)).thenReturn(Optional.of(dataEntity));

        String result = myService.processData(1L);
        assertEquals("Processed Sample Data", result);
    }
}

