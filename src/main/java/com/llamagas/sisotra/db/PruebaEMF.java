/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.llamagas.sisotra.db;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Java-LM
 */
public class PruebaEMF {
    public static void main(String[] args) {
        EntityManagerFactory emf = PersistenceUtil.creaEntityManagerFactory(
            ConnectionPoolGenerator.getConnectionPool());
        EntityManager em = emf.createEntityManager();
        System.out.println("Conexión satisfactoria");
        em.close();
        emf.close();
    }
}
