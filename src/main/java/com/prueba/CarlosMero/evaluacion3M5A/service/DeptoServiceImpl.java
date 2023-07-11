/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.CarlosMero.evaluacion3M5A.service;

import com.prueba.CarlosMero.evaluacion3M5A.modelo.Depto;
import com.prueba.CarlosMero.evaluacion3M5A.repository.DeptoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author carlos
 */
@Service
public class DeptoServiceImpl  extends GenericServiceImpl<Depto, Long> implements GenericService<Depto, Long> {

    @Autowired
    DeptoRepository deptoRepository;

    @Override
    public CrudRepository<Depto, Long> getDao() {
        return deptoRepository;
    }
    
}
