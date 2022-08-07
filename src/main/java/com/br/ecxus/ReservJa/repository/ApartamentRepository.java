package com.br.ecxus.ReservJa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.ecxus.ReservJa.model.Apartament;

@Repository
public interface ApartamentRepository extends JpaRepository<Integer, Apartament>{
    
}
