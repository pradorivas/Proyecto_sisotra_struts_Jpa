/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.llamagas.sisotra.service;

import com.llamagas.sisotra.dao.PersonalDaoImpl;
import com.llamagas.sisotra.modelo.Personal;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author DENIS
 */
public class PersonalServiceJpaImpl implements PersonalService{
     private EntityManagerFactory emf;

    public void setEmf(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public PersonalDaoImpl creaUnidadDao(EntityManager em) {
        PersonalDaoImpl personalDaoImpl = new PersonalDaoImpl();
        personalDaoImpl.setEmf(em);
        return personalDaoImpl;
    }

    @Override
    public List<Personal> buscar() {
        EntityManager em = emf.createEntityManager();
        List<Personal> lista = creaUnidadDao(em).buscar();
        em.close();
        return lista;
    }
}
