<%-- 
    Document   : index
    Created on : 2/11/2012, 11:04:33 AM
    Author     : portatil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <title>JSP Page</title>
        <s:head/>
    </head>
    <body>
        <h1><s:text name="titulo.principal"/></h1>
        
        <s:form action="login">           
            <s:textfield key="formulario.username" name="usuario.username"/>
            <s:password key="formulario.password" name="usuario.password"/>
            <s:submit value="%{getText('formulario.boton')}"/>
        </s:form>
        
        <s:actionerror/>
        
        
        <s:url var="ingles" includeParams="all" value="">
                <s:param name="request_locale">en</s:param>
        </s:url>	
        <s:url var="espanol" includeParams="all" value="">
                <s:param name="request_locale">es</s:param>
        </s:url>

      
         <s:a href="%{ingles}">Ingles</s:a>
         <s:a href="%{espanol}">Español</s:a>
                 

    </body>
</html>
