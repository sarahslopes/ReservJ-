package com.br.ecxus.ReservJa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.br.ecxus.ReservJa.repository.ApartamentRepository;
import com.br.ecxus.ReservJa.service.ApartamentService;

public class ApartamentServiceTest {
    
    @MockBean
    ApartamentRepository repository;

    @Autowired
    ApartamentService service;

    @Test
    public void testeAplicacao(){
        System.out.println("ok");
    }

}
