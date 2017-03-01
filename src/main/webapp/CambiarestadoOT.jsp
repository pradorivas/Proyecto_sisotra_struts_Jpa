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
        <h1><s:text name="ASIGNAR OT"/></h1>

        <s:form action="AsignarOT" method="post">       
            <s:textfield key="formulario.OT" name="ordenTrabajo.IdOrdenT" readonly="true"/>
            <s:textfield key="formulario.descripcionOT" name="ordenTrabajo.Descripcion" readonly="true"/>
            <s:textfield key="formulario.estado" name="ordenTrabajo.Estado" readonly="true"/>
            <s:select key="formulario.especialidad" name="ordenTrabajo.Area_emple" 
                      list="listaArea"
                      headerKey=""
                      headerValue="---Seleccione---"
                     />
            <s:submit key="formulario.registro.asignar"/>
        </s:form>
        <s:url var="url1" action="inicioAsignarOT"/>
        <s:a href="%{url1}">Cancelar Asignacion</s:a>
        </center>
        <p><s:actionmessage/></p>
<!--{'MECANICO':'MECANICO','ELECTRICISTA':'ELECTRICISTA','PINTURA':'PINTURA'}-->
</body>
</html>
