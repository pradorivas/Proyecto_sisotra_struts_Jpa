/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.llamagas.sisotra.listener;

import com.llamagas.sisotra.db.ConnectionPoolGenerator;
import com.llamagas.sisotra.db.PersistenceUtil;
import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


/**
 *
 * @author Java-LM
 */
public class AplicacionListener implements ServletContextListener {

    private EntityManagerFactory emf;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        emf = PersistenceUtil.creaEntityManagerFactory(
            ConnectionPoolGenerator.getConnectionPool());
        sce.getServletContext().setAttribute("emf", emf);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        emf.close();
    }
}
