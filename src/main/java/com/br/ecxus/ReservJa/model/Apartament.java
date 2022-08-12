package com.br.ecxus.ReservJa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "APARTAMENT")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Apartament {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(nullable = false, unique = true , length = 50)
    private String name;
    @Column(nullable = false, length = 5)
    private String room;
    @Column(nullable = false, length = 5)
    private String customers;
    @Column(nullable = false, length = 50)
    private String status;
    
}

