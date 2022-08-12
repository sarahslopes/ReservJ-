package com.br.ecxus.ReservJa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.br.ecxus.ReservJa.model.Apartament;

@Repository
public interface ApartamentRepository extends JpaRepository<Apartament, Integer>{
 
    @Query(value = " select c from Apartament c where c.name like :name ")
    List<Apartament> findByName(@Param("name") String name);

    @Query(value = " select c from Apartament c where c.room like :room ")
    List<Apartament> findByRoom(@Param("room") String room);

    boolean existsByName(String name);
    boolean existsByRoom(String room);
    
  
}
