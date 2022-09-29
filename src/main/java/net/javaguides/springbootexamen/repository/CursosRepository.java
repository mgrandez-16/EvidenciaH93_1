package net.javaguides.springbootexamen.repository;

import net.javaguides.springbootexamen.model.Cursos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface CursosRepository extends JpaRepository<Cursos, Long>  {

}
