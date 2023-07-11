/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.CarlosMero.evaluacion3M5A.modelo;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author carlos
 */
@Document(collection = "Curso")
@Data
public class Curso {
    private long curso_id;
    private String nombre;
    private String nivel;
    private String descripcion;
    
    @ManyToOne
    @JoinColumn(name = "prof_id", referencedColumnName = "prof_id")
    private Profesor profesor;
    
}
