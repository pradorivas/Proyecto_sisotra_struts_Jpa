<%-- 
    Document   : registrarOT
    Created on : 20/01/2017, 12:08:31 AM
    Author     : DENIS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <title>JSP Page</title>
        <s:head/>
    </head>
    <body><center>
        <h2><s:text name="formulario.titulo.nuevo"/></h2>
        
        <s:form action="EVregistrarOT" method="post">     
            <s:hidden name="ordenTrabajo.IdOrdenT"/>
            <s:select list="#session.unidades" 
                      listKey="idplaca" 
                      listValue="idplaca"
                      name="ordenTrabajo.unidad.idplaca"
                      key="formulario.unidad"
                      required="true" />
            <s:select list="#session.personales" 
                      listKey="idnomina" 
                      listValue="idnomina"
                      name="ordenTrabajo.personal.idnomina"
                      key="formulario.personal"
                      required="true"/>
            <s:textfield key="formulario.descripcionOT" name="ordenTrabajo.Descripcion"/>
            <s:textfield key="formulario.Kilometraje" name="ordenTrabajo.Kilometraje"/>
            <s:submit value="%{getText('formulario.registro')}"/>
            
            <s:reset value="formulario.Limpiar"/>
        </s:form>
    </center>
        <p><s:actionmessage/></p>
    </body>
</html>
