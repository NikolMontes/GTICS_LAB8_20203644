package com.proyect.lab8__20203644.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="Estudiante")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idestudiante")
    private Integer idestudiante;
    private String nombre;
    private Double gpa;
    private Double numerocreditos;
    @ManyToOne
    @JoinColumn(name="Facultad_idFacultad")
    private Facultad facultad;

}
