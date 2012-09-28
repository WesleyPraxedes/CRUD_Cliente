<%-- Document   : form_cadastro
     Author     : Wesley --%>

<%@page contentType="text/html" pageEncoding="ISO-8859-9"%><%--Se pageEncoding estive UTF mude--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadrastrar novo cliente</title>
    </head>
    <body>
        <h1>Cadrastrar novo cliente</h1>
        <hr>
        <strong>Formulúrio de cadastro de clientes.</strong><br/>
        <br/>
        Preencher todos os campos!<br/>
        
        <form action="cadastrar.jsp" method="post">
            Nome: <input type="text" name="cpNome" id="cpNome" value="" /> <br/>
            Email: <input type="text" name="cpEmail" id="cpEmail" value="" /> <br/>
            Telefone: <input type="text" name="cpTel" id="cpTel" value="" />(XX44445555)<br/>
            Sexo: <input type="radio" name="cpSexo" id="cpSexoM" value="M"> Masculino
                  <input type="radio" name="cpSexo" id="cpSexoF" value="F"> Feminino <br/>
            Data de nascimento: <input type="text" name="cpDataNasc" id="cpDataNasc" value="" />(dd/mm/yyyy) <br/>
            <br/>
            <input type="submit" value="Cadastrar Cliente"/>  <input type="reset" value="Limpar campos"/>
        </form>
        <br/>
        <br/>
        <a href="index.jsp">Voltar para Pagina Inicial</a> <br/> 
    </body>
</html>