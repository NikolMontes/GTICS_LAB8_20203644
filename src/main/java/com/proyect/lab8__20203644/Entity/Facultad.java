package com.proyect.lab8__20203644.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Facultad")
@Getter
@Setter
public class Facultad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idFacultad")
    private Integer idfacultad;

    private String nombre;

}
