<%@page contentType="text/html" pageEncoding="ISO-8859-9"%>
<jsp:useBean id="fac" class="facade.FormFacade"/>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirma��o da Inscri��o do Candidato</title>
    </head>
    <body>
        <h1>Resultado da Inscri��o</h1>
        <hr>
        <h2><%=fac.atualizarCliente(request)%></h2>
        <br>
        <br>
        [<a href="index.jsp">      Voltar para pagina inicial </a>]
    </body>
</html>