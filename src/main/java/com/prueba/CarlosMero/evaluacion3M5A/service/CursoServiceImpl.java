/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.CarlosMero.evaluacion3M5A.service;

import com.prueba.CarlosMero.evaluacion3M5A.modelo.Curso;
import com.prueba.CarlosMero.evaluacion3M5A.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author carlos
 */
@Service
public class CursoServiceImpl extends GenericServiceImpl<Curso, Long> implements GenericService<Curso, Long> {

    @Autowired
    CursoRepository cursoRepository;

    @Override
    public CrudRepository<Curso, Long> getDao() {
        return cursoRepository;
    }
    
}
