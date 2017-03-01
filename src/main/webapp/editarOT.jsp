<%-- 
    Document   :editarOT
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
        <h1><s:text name="MODIFICAR OT"/></h1>

        <s:form action="EVeditarOT" method="post">       
            <s:textfield key="formulario.OT" name="ordenTrabajo.IdOrdenT" readonly="true"></s:textfield>
            <s:textfield key="formulario.Placa" name="ordenTrabajo.unidad.idplaca" readonly="true"></s:textfield>
            <s:textfield key="formulario.Nomina" name="ordenTrabajo.personal.idnomina" readonly="true"></s:textfield>
            <s:textfield key="formulario.descripcionOT" name="ordenTrabajo.Descripcion"/>
            <s:hidden name="ordenTrabajo.Estado"/>
            <s:submit key="formulario.registro.editar"/>
        </s:form>
        <s:url var="url1" action="listadoOT"/>
        <s:a href="%{url1}">Cancelar Modicicacion</s:a>
        </center>
        <p><s:actionmessage/></p>
</body>
</html>
