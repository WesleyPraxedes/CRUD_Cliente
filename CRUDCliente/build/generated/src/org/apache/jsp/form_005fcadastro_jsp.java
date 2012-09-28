package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class form_005fcadastro_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=ISO-8859-9");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Cadrastrar novo cliente</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Cadrastrar novo cliente</h1>\n");
      out.write("        <strong>Formulúrio de cadastro de clientes.<br/>\n");
      out.write("        </strong><br/>\n");
      out.write("        Preencher todos os campos!<br/>\n");
      out.write("        \n");
      out.write("        <form action=\"cadastrar.jsp\" method=\"post\">\n");
      out.write("            Nome: <input type=\"text\" name=\"cpNome\" id=\"cpNome\" value=\"\" /> <br/>\n");
      out.write("            Email: <input type=\"text\" name=\"cpEmail\" id=\"cpEmail\" value=\"\" /> <br/>\n");
      out.write("            Telefone: <input type=\"text\" name=\"cpTel\" id=\"cpTel\" value=\"\" />(XX44445555)<br/>\n");
      out.write("            Sexo: <input type=\"radio\" name=\"cpSexo\" id=\"cpSexoM\" value=\"M\"> Masculino\n");
      out.write("                  <input type=\"radio\" name=\"cpSexo\" id=\"cpSexoF\" value=\"F\"> Feminino <br/>\n");
      out.write("            Data de nascimento: <input type=\"text\" name=\"cpDataNasc\" id=\"cpDataNasc\" value=\"\" />(dd/mm/yyyy) <br/>\n");
      out.write("            <br/>\n");
      out.write("            <input type=\"submit\" value=\"Cadastrar Cliente\"/>  <input type=\"reset\" value=\"Limpar campos\"/>\n");
      out.write("        </form>\n");
      out.write("        <br/>\n");
      out.write("        <br/>\n");
      out.write("        <a href=\"index.jsp\">Voltar para Pagina Inicial</a> <br/> \n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
