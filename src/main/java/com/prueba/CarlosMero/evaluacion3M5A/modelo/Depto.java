/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.CarlosMero.evaluacion3M5A.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author carlos
 */
@Document(collection = "Depto")
@Data
public class Depto {

    private Long depto_id;
    private String nombre;
    private String director;
    private String direccion;

    @JsonIgnore
    @OneToMany(mappedBy = "depto")
    private List<Profesor> listaprofesor;
}
