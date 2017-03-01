/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.llamagas.sisotra.dao;

import com.llamagas.sisotra.modelo.Personal;
import com.llamagas.sisotra.modelo.Unidad;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author DENIS
 */
public class PersonalDaoImpl implements PersonalDao{

    private EntityManager emf;

    public void setEmf(EntityManager emf) {
        this.emf = emf;
    }
    
    @Override
    public List<Personal> buscar() {
        TypedQuery<Personal> tquery = emf.createNamedQuery("Empleado.getTodos", Personal.class);
        return tquery.getResultList();
    }
    
}
