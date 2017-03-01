    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.llamagas.sisotra.db;

import com.zaxxer.hikari.HikariDataSource;
import javax.sql.DataSource;

/**
 *
 * @author Java-LM
 */
public class ConnectionPoolGenerator {

    /*
    <property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/bd_jmad"/>
    <property name="javax.persistence.jdbc.password" value="mysql"/>
    <property name="javax.persistence.jdbc.driver" value="com.mysql.jdbc.Driver"/>
    <property name="javax.persistence.jdbc.user" value="root"/>
    */
    public static DataSource getConnectionPool() {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/bd_llamagas");
        dataSource.setUsername("root");
        dataSource.setPassword("");
        dataSource.setMaximumPoolSize(10);
        dataSource.setConnectionTimeout(10000);
        dataSource.setAutoCommit(false);
        return dataSource;
    }
}
