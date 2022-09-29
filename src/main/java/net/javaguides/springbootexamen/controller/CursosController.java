package net.javaguides.springbootexamen.controller;

import net.javaguides.springbootexamen.exception.ResourceNotFoundException;
import net.javaguides.springbootexamen.model.Cursos;
import net.javaguides.springbootexamen.repository.CursosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cursos")
public class CursosController {

    @Autowired
    private CursosRepository cursosRepository;

    @GetMapping
    public List<Cursos> getAllCursos(){
        return cursosRepository.findAll();
    }

    @PostMapping
    public Cursos createAlumnos(@RequestBody Cursos cursos){
        return cursosRepository.save(cursos);
    }

    @PutMapping("{id}")
    public ResponseEntity<Cursos> updateCursos(@PathVariable long id, @RequestBody Cursos cursosDetalles){
        Cursos updateCursos = cursosRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Curso no existe con id: "+id));
        updateCursos.setNomcurso(cursosDetalles.getNomcurso());
        updateCursos.setCreditos(cursosDetalles.getCreditos());
        cursosRepository.save(updateCursos);

        return ResponseEntity.ok(updateCursos);
    }



}
