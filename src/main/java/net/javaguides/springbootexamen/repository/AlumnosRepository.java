package net.javaguides.springbootexamen.repository;

import net.javaguides.springbootexamen.model.Alumnos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface AlumnosRepository extends JpaRepository<Alumnos, Long> {

}
