package com.br.ecxus.ReservJa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.GenerationType;


import lombok.Data;

@Entity
@Table(name = "APARTAMENT_ROOM")
@Data
public class ApartamentRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(nullable = false, length = 4)
    private String name;
    @ManyToOne
    @JoinColumn(name = "ap")
    private Apartament apartament;
}
