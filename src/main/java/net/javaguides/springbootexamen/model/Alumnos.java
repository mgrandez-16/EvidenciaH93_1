package net.javaguides.springbootexamen.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "alumnos")
public class Alumnos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idalumno;

    @Column(name = "nombalumno")
    private String nombalumno;

    @Column(name = "apelalumno")
    private String apelalumno;

    @Column(name = "correo")
    private String correo;

    @Column(name = "edad")
    private int edad;

    @Column(name = "iporigen")
    private String iporigen;
}