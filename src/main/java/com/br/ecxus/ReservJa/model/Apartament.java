package com.br.ecxus.ReservJa.model;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * Apartament
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Apartament {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(nullable = false, unique = true , length = 5)
    private String name;
    @Column(nullable = false, length = 4)
    private Integer customers;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 50)
    private Status status;

}
