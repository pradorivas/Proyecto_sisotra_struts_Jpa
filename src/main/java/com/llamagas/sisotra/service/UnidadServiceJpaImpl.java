/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.llamagas.sisotra.service;

import com.llamagas.sisotra.dao.UnidadDaoImpl;
import com.llamagas.sisotra.modelo.Unidad;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author DENIS
 */
public class UnidadServiceJpaImpl implements UnidadService{
    private EntityManagerFactory emf;

    public void setEmf(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public UnidadDaoImpl creaUnidadDao(EntityManager em) {
        UnidadDaoImpl unidadDaoImpl = new UnidadDaoImpl();
        unidadDaoImpl.setEmf(em);
        return unidadDaoImpl;
    }

    @Override
    public List<Unidad> buscar() {
        EntityManager em = emf.createEntityManager();
        List<Unidad> lista = creaUnidadDao(em).buscar();
        em.close();
        return lista;
    }
}
