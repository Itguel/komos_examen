package com.kosmo.hospital.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "CONSULTORIOS")
@Data
public class Consultorios {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "consultorio_id")
    private Integer consultorioId;

    @Column(name = "piso")
    private Integer piso;

    @Column(name = "consultorio")
    private Integer consultorio;

}
