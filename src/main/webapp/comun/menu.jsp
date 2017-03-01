<%@taglib prefix="s" uri="/struts-tags"%>

<ul>
    <li>
        <s:url action="logout" id="salir"/>
        <s:a href="%{salir}"><s:text name="enlace.logout"/> </s:a>
    </li>
    <!--<:set var="cod" value="%#sesion.get('user')" scope="page"/>-->
    <s:if test="#session.user.equals('jefeflota') || #session.user.equals('admin')">
    <li> 
        <s:url action="inicioRegistroOT" id="newOT"/>
        <s:a href="%{newOT}"><s:text name="enlace.OTnuevo"/></s:a>
    </li>
    <li>
        <s:url action="listadoOT" id="newLista_ot"/>
        <s:a href="%{newLista_ot}"><s:text name="enlace.OT.listado"/></s:a>
    </li>
    </s:if>
    <s:if test="#session.user.equals('jefetaller') || #session.user.equals('admin')">
    <li>
        <s:url action="inicioAsignarOT" id="newAsigna_ot"/>
        <s:a href="%{newAsigna_ot}"><s:text name="enlace.OT.asignarOT"/></s:a>
    </li>
    <li>
        <s:url action="ListaAsignaciones" id="newLista_Asignacion"/>
        <s:a href="%{newLista_Asignacion}"><s:text name="enlace.OT.ListaAsignaciones"/></s:a>
    </li>
    </s:if>
        <s:url var="ingles" includeParams="all" value="">
            <s:param name="request_locale">en</s:param>
        </s:url>	
        <s:url var="espanol" includeParams="all" value="">
            <s:param name="request_locale">es</s:param>
        </s:url>
    <li>
        <s:a href="%{ingles}">Ingles</s:a>
        <s:a href="%{espanol}">Español</s:a>
    </li>
</ul>   
