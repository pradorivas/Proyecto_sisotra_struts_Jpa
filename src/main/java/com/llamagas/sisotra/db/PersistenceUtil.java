/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.llamagas.sisotra.db;

import java.util.HashMap;
import java.util.Map;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.sql.DataSource;


/**
 *
 * @author Java-LM
 */
public class PersistenceUtil {
    public static EntityManagerFactory creaEntityManagerFactory(DataSource ds) {
        Map<String, Object> properties = new HashMap<>();
        String dataSourceKey = org.hibernate.cfg.AvailableSettings.DATASOURCE;
        properties.put(dataSourceKey, ds);
        EntityManagerFactory emf =
            Persistence.createEntityManagerFactory(
                "PU_llamagas", properties);
        return emf;
    }
}
