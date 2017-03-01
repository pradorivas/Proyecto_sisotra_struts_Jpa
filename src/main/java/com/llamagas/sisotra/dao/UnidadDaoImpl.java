/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.llamagas.sisotra.dao;

import com.llamagas.sisotra.modelo.Unidad;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author DENIS
 */
public class UnidadDaoImpl implements UnidadDao {

    private EntityManager emf;

    public void setEmf(EntityManager emf) {
        this.emf = emf;
    }

    @Override
    public List<Unidad> buscar() {
        TypedQuery<Unidad> tquery = emf.createNamedQuery("Unidades.getTodos", Unidad.class);
        return tquery.getResultList();
    }

}
