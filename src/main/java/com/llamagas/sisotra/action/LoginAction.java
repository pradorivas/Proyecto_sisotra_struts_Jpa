    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.llamagas.sisotra.action;

import com.llamagas.sisotra.modelo.Usuario;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import org.apache.struts2.dispatcher.SessionMap;

public class LoginAction extends ActionSupport{

    public Usuario usuario;
    //public Map sesio;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String login() throws Exception {
        if ((usuario.getUsername().equals("jefeflota") && usuario.getPassword().equals("123"))
                || (usuario.getUsername().equals("jefetaller") && usuario.getPassword().equals("123"))
                || (usuario.getUsername().equals("admin") && usuario.getPassword().equals("123"))) {
            //obtenemos sesion
            Map sesion = ActionContext.getContext().getSession();
            //guardamos objetos en sesion
            sesion.put("user", getUsuario().getUsername());
            //setSession(sesion);
            addActionMessage(getText("login.ok"));
            return SUCCESS;
        } else {
            addActionError(getText("login.error"));
            return LOGIN;
        }
    }

    public String logout() throws Exception {
        //obtenemos sesion
        Map sesion = ActionContext.getContext().getSession();
        SessionMap sessionMap = (SessionMap) sesion;
        sessionMap.invalidate();
        return LOGIN;
    }

    public String inicio() {
        return LOGIN;
    }

    @Override
    public void validate() {
        if (getUsuario() != null) {
            String usuario = getUsuario().getUsername();
            String password = getUsuario().getPassword();

            if (usuario == null || usuario.equals("")) {
                addFieldError("usuario.username", "Ingrese usuario");
            }
            if (password == null || password.equals("")) {
                addFieldError("usuario.password", "Ingrese password");
            }
            //n validaciones
        }

    }

}
