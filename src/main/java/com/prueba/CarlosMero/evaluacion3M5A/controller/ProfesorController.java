/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.CarlosMero.evaluacion3M5A.controller;

import com.prueba.CarlosMero.evaluacion3M5A.modelo.Curso;
import com.prueba.CarlosMero.evaluacion3M5A.modelo.Depto;
import com.prueba.CarlosMero.evaluacion3M5A.modelo.Profesor;
import com.prueba.CarlosMero.evaluacion3M5A.service.CursoServiceImpl;
import com.prueba.CarlosMero.evaluacion3M5A.service.DeptoServiceImpl;
import com.prueba.CarlosMero.evaluacion3M5A.service.ProfesorServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author carlos
 */
@RestController
@RequestMapping("/api/profesor")
public class ProfesorController {

    @Autowired
    ProfesorServiceImpl profesorService;

    @GetMapping("/listar")
    public ResponseEntity<List<Profesor>> listarProductos() {
        return new ResponseEntity<>(profesorService.findByAll(),
                HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Profesor> crearProducto(
            @RequestBody Profesor p) {
        return new ResponseEntity<>(profesorService.save(p),
                HttpStatus.CREATED);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Profesor> actualizarProducto(@PathVariable Long id, @RequestBody Profesor p) {
        Profesor personaENcontrada = profesorService.findById(id);
        if (personaENcontrada == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                personaENcontrada.setNombre(p.getNombre());
                personaENcontrada.setTelefono(p.getTelefono());
                personaENcontrada.setDireccion(p.getDireccion());
                return new ResponseEntity<>(profesorService.save(p), HttpStatus.OK);
            } catch (DataAccessException e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Profesor> eliminarProducto(@PathVariable Long id) {
        profesorService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    
    
    
    @Autowired
    CursoServiceImpl cursoService;
    
     @GetMapping("/listarcursos")
    public ResponseEntity<List<Curso>> listarCursos() {
        return new ResponseEntity<>(cursoService.findByAll(),
                HttpStatus.OK);
    }

    @PostMapping("/crearcurso")
    public ResponseEntity<Curso> crearCurso(
            @RequestBody Curso p) {
        return new ResponseEntity<>(cursoService.save(p),
                HttpStatus.CREATED);
    }

    @PutMapping("/actualizarcurso/{id}")
    public ResponseEntity<Curso> actualizarCurso(@PathVariable Long id, @RequestBody Curso p) {
        Curso personaENcontrada = cursoService.findById(id);
        if (personaENcontrada == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                personaENcontrada.setNombre(p.getNombre());
                personaENcontrada.setDescripcion(p.getDescripcion());
                personaENcontrada.setNivel(p.getNivel());
                return new ResponseEntity<>(cursoService.save(p), HttpStatus.OK);
            } catch (DataAccessException e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @DeleteMapping("/eliminarcurso/{id}")
    public ResponseEntity<Curso> eliminarCurso(@PathVariable Long id) {
        cursoService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
     @Autowired
    DeptoServiceImpl deptoService;
    
     @GetMapping("/listardepto")
    public ResponseEntity<List<Depto>> listardepto() {
        return new ResponseEntity<>(deptoService.findByAll(),
                HttpStatus.OK);
    }

    @PostMapping("/creardepto")
    public ResponseEntity<Depto> creardepto(
            @RequestBody Depto p) {
        return new ResponseEntity<>(deptoService.save(p),
                HttpStatus.CREATED);
    }

    @PutMapping("/actualizardepto/{id}")
    public ResponseEntity<Depto> actualizarCurso(@PathVariable Long id, @RequestBody Depto p) {
        Depto personaENcontrada = deptoService.findById(id);
        if (personaENcontrada == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                personaENcontrada.setNombre(p.getNombre());
                personaENcontrada.setDireccion(p.getDireccion());
                personaENcontrada.setDirector(p.getDirector());
                return new ResponseEntity<>(deptoService.save(p), HttpStatus.OK);
            } catch (DataAccessException e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @DeleteMapping("/eliminardepto/{id}")
    public ResponseEntity<Depto> eliminardepto(@PathVariable Long id) {
        deptoService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
