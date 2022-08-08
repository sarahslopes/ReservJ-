package com.br.ecxus.ReservJa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.br.ecxus.ReservJa.model.ApartamentRoom;

@Repository
public interface ApartamentRoomRepository extends JpaRepository<ApartamentRoom, Integer>{
 
    @Query(value = " select c from Apartament c where c.name like :name ")
    List<ApartamentRoom> findByName(@Param("name") String name);

    boolean existsByName(String name);
}
