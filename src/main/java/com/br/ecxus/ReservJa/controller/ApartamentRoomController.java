package com.br.ecxus.ReservJa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.br.ecxus.ReservJa.model.ApartamentRoom;
import com.br.ecxus.ReservJa.service.ApartamentRoomService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/room")
public class ApartamentRoomController {
    
    @Autowired
    ApartamentRoomService service;

    @PostMapping("/create")
    @ApiOperation("Cadastro de um quarto")
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody ApartamentRoom create(ApartamentRoom apartament) {
        return service.create(apartament);
    }

    @GetMapping("/list")
    @ApiOperation("Listagem de quartos cadastrados")
    @ResponseStatus(HttpStatus.FOUND)
    public List<ApartamentRoom> list() {
        return service.list();
    }

    @GetMapping("/listId/{id}")
    @ApiOperation("Listagem do quarto pelo id")
    @ResponseStatus(HttpStatus.FOUND)
    public Object listById(@PathVariable Integer id) {
        return service.listById(id);
    }

    @GetMapping("/listName/{name}")
    @ApiOperation("Listagem do quarto pelo nome")
    @ResponseStatus(HttpStatus.FOUND)
    public Object listByName(@PathVariable String name) {
        return service.listByName(name);
    }

    @PatchMapping("/update/{id}")
    @ApiOperation("Atualização / edição do quarto pelo id")
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody ApartamentRoom update(@PathVariable ApartamentRoom apartament) {
        return service.create(apartament);
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation("Exclusão do quarto pelo id")
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
