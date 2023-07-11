/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.CarlosMero.evaluacion3M5A.repository;

import com.prueba.CarlosMero.evaluacion3M5A.modelo.Depto;
import com.prueba.CarlosMero.evaluacion3M5A.modelo.Profesor;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author carlos
 */
public interface DeptoRepository extends MongoRepository<Depto, Long>{
    
}
