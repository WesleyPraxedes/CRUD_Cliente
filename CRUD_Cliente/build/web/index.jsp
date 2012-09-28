<%-- Document   : index
     Author     : Wesley --%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="fac" class="facade.FormFacade"/>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina principal CRUD Cliente</title>
    </head>
    <body>
        <h1>Pagina principal CRUD Cliente</h1>        
        
        <input type="button" value="Cadastrar novo Cliente" onclick="location.href='form_cadastro.jsp'"/>
        
        <h2>Lista de clientes</h2>
        <%=fac.getListClientes()%>

    </body>
</html>
