/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.llamagas.sisotra.modelo;

import java.io.Serializable;

/**
 *
 * @author portatil
 */
public class Usuario implements Serializable {

    private static String username;
    private static String password;

    public Usuario() {
       
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
