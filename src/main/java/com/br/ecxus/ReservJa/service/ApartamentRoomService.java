package com.br.ecxus.ReservJa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.ecxus.ReservJa.model.ApartamentRoom;
import com.br.ecxus.ReservJa.repository.ApartamentRoomRepository;

@Service
public class ApartamentRoomService {
    
    @Autowired
    ApartamentRoomRepository repository;

    public ApartamentRoom create(ApartamentRoom apartament) {
        return repository.save(apartament);
    }

    public List<ApartamentRoom> list() {
        return repository.findAll();
    }

    public Object listById(Integer id) {
        return repository.findById(id);
    }

    public Object listByName(String name) {
        return repository.findByName(name);
    }

    public ApartamentRoom update(ApartamentRoom apartament) {
        return create(apartament);

    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

}
