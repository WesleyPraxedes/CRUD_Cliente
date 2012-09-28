<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="fac" class="facade.FormFacade"/>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">        
        <title>Confirmação excluir</title>
    </head>
    <body>
        <h1>Resultado da Inscrição</h1>
        <hr>
        <h2><%=fac.excluirCliente(request)%></h2>
        <br>
        <br>
        [<a href="index.jsp">Voltar para pagina inicial </a>]
    </body>
</html>
