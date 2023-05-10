package com.kosmo.hospital.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "DOCTORES")
@Data
public class Doctor {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "doctor_id")
    private Integer doctorId;

    @Column(name = "nombre", precision = 12, scale = 2)
    private String nombre;

    @Column(name = "apellido_paterno", precision = 12, scale = 2, nullable = false)
    private String apellidoPaterno;

    @Column(name = "apellido_materno", precision = 5, scale = 4, nullable = false)
    private String apellidoMaterno;

    @Column(name = "especialidad", precision = 13, scale = 3, nullable = false)
    private String especialidad;
}
