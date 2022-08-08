package com.br.ecxus.ReservJa.controller;

import java.util.List;

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

import com.br.ecxus.ReservJa.model.Apartament;
import com.br.ecxus.ReservJa.service.ApartamentService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/apartament")
public class ApartamentController {

    final ApartamentService service;

    public ApartamentController(ApartamentService service) {
        this.service = service;
    }

    @PostMapping("/create")
    @ApiOperation("Cadastro de um apartamento")
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody Apartament create(Apartament apartament) {
        return service.create(apartament);
    }

    @GetMapping("/list")
    @ApiOperation("Listagem de apartamentos cadastrados")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Apartament> list() {
        return service.list();
    }

    @GetMapping("/listId/{id}")
    @ApiOperation("Listagem do apartamento pelo id")
    @ResponseStatus(HttpStatus.FOUND)
    public Object listById(@PathVariable Integer id) {
        return service.listById(id);
    }

    @GetMapping("/listName/{name}")
    @ApiOperation("Listagem do apartamento pelo nome")
    @ResponseStatus(HttpStatus.FOUND)
    public Object listByName(@PathVariable String name) {
        return service.listByName(name);
    }

    @PatchMapping("/update/{id}")
    @ApiOperation("Atualização / edição do apartamento pelo id")
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody Apartament update(@PathVariable Apartament apartament) {
        return service.create(apartament);
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation("Exclusão do apartamento pelo id")
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

}
