<%-- Document   : form_cadastro
     Author     : Wesley --%>

<%@page contentType="text/html" pageEncoding="ISO-8859-9"%><%--Se pageEncoding estive UTF mude--%>
<jsp:useBean id="fac" class="facade.FormFacade"/>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Atualizar cliente</title>
    </head>
    <body>
        <h1>Atualizar cliente</h1>
        <hr>
        <strong>Formulúrio de Atualização de dados.</strong><br/>
        <br/>
        <%=fac.getPreencherForm(request)%>
        <br/>
        <br/>
        [<a href="index.jsp">      Voltar para pagina inicial </a>]
    </body>
</html>