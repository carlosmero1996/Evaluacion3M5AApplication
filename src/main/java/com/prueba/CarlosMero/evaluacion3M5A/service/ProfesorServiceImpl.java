/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.CarlosMero.evaluacion3M5A.service;

import com.prueba.CarlosMero.evaluacion3M5A.modelo.Profesor;
import com.prueba.CarlosMero.evaluacion3M5A.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author carlos
 */
@Service
public class ProfesorServiceImpl extends GenericServiceImpl<Profesor, Long> implements GenericService<Profesor, Long> {

    @Autowired
    ProfesorRepository profesorRepository;

    @Override
    public CrudRepository<Profesor, Long> getDao() {
        return profesorRepository;
    }

    
}
