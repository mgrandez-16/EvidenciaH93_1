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
@Table(name = "matricula")

public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idmatricula;

    @Column(name = "idcurso")
    private long idcurso;

    @Column(name = "idalumno")
    private long idalumno;

}
