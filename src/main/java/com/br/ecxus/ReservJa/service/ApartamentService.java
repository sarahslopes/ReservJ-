package com.br.ecxus.ReservJa.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.ecxus.ReservJa.model.Apartament;
import com.br.ecxus.ReservJa.repository.ApartamentRepository;

@Service
public class ApartamentService {

    @Autowired
    ApartamentRepository repository;

    public Apartament create(@Valid Apartament apartament) {
        return repository.save(apartament);
    }

    public List<Apartament> list() {
        return repository.findAll();
    }

    public Object listById(Integer id) {
        return repository.findById(id);
    }

    public Object listByName(String name) {
        return repository.findByName(name);
    }

    public Object listByRoom(String room){
        return repository.findByRoom(room);
    }

    public Apartament update(@Valid Apartament apartament) {
        return create(apartament);

    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}