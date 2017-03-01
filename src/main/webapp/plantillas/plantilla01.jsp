<%-- 
    Document   : plantilla01
    Created on : 2/05/2012, 10:11:27 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>   
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <table border="0">
		<tr>
			<td colspan="2">
				<!-- CABECERA -->
                                <tiles:insertAttribute name="cabecera"/>
			</td>
		</tr>
		<tr>
                        <td style="width: 200px; vertical-align: top">
				<!-- MENU -->
                                <tiles:insertAttribute name="menu"/>
			</td>
			<td style="width: 550px;">
				<!-- CUERPO -->
                                <tiles:insertAttribute name="cuerpo"/>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<!-- PIE -->
                                <tiles:insertAttribute name="pie"/>
			</td>
		</tr>
	
	
	</table>
    </center>
    </body>
</html>
