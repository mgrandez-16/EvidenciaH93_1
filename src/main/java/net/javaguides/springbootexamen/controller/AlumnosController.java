package net.javaguides.springbootexamen.controller;

import net.javaguides.springbootexamen.exception.ResourceNotFoundException;
import net.javaguides.springbootexamen.model.Alumnos;
import net.javaguides.springbootexamen.repository.AlumnosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/alumnos")
public class AlumnosController {

    @Autowired
    private AlumnosRepository alumnosRepository;

    @GetMapping
    public List<Alumnos> getAllAlumnos(){
        return alumnosRepository.findAll();
    }

    @PostMapping
    public Alumnos createAlumnos(@RequestBody Alumnos alumnos){
        return alumnosRepository.save(alumnos);
    }

    @PutMapping("{id}")
    public ResponseEntity<Alumnos> updateAlumnos(@PathVariable long id, @RequestBody Alumnos alumnosDetalles){
        Alumnos updateAlumnos = alumnosRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Alumno no existe con id: "+id));
        updateAlumnos.setNombalumno(alumnosDetalles.getNombalumno());
        updateAlumnos.setApelalumno(alumnosDetalles.getApelalumno());
        updateAlumnos.setCorreo(alumnosDetalles.getCorreo());
        updateAlumnos.setEdad(alumnosDetalles.getEdad());
        updateAlumnos.setIporigen(alumnosDetalles.getIporigen());
        alumnosRepository.save(updateAlumnos);

        return ResponseEntity.ok(updateAlumnos);
    }

}
