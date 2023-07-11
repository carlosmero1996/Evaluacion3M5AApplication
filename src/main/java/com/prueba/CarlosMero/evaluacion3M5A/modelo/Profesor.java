/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.CarlosMero.evaluacion3M5A.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.util.List;
import lombok.Data;
import jakarta.persistence.OneToMany;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author carlos
 */
@Document(collection = "Profesor")
@Data
public class Profesor {
    private Long prof_id;
    private String nombre;
    private String direccion;
    private String telefono;
    
    @JsonIgnore
    @OneToMany(mappedBy = "profesor")
    private List<Curso> listacurso;
    
        
    @ManyToOne
    @JoinColumn(name = "depto_id", referencedColumnName = "depto_id")
    private Depto depto;
}
