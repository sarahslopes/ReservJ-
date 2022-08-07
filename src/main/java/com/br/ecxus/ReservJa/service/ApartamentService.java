package com.br.ecxus.ReservJa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.ecxus.ReservJa.repository.ApartamentRepository;

@Service
public class ApartamentService {
    
    @Autowired
    ApartamentRepository apRepo;

}
