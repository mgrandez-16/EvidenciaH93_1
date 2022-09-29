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
@Table(name = "cursos")

public class Cursos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idcurso;

    @Column(name = "nomcurso")
    private String nomcurso;

    @Column(name = "creditos")
    private String creditos;

}
