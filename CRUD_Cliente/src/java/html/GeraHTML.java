package html;

import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import model.Cliente;



/**
 *
 * @author Wesley
 */
public class GeraHTML {
    public String getList(List lista){        
        StringBuffer sb=new StringBuffer();
        sb.append("<table width='100%' border='1'>\r\n"
                + "<tr>\r\n"
                    + "<td>Código cliente</td>"
                    + "<td>Nome</td>"
                    + "<td>Email</td>"
                    + "<td>Fone</td>"
                    + "<td>Sexo</td>"
                    + "<td>Data</td>"
                    + "<td>Excluir</td>"
                    + "<td>Atualizar</td>\r\n"
                + "</tr>\r\n");
        for (Iterator it = lista.iterator(); it.hasNext();) {
            String strDate;
            Cliente cli = (Cliente) it.next();
            strDate="Null Value";
            if(cli.getDtnasc()!=null){
                strDate = new SimpleDateFormat("dd/MM/yyyy").format(cli.getDtnasc());
            }
            sb.append("<tr>\r\n"
                        + "<td>"+cli.getId()+"</td>"
                        + "<td>"+cli.getNome()+"</td>"
                        + "<td>"+cli.getEmail()+"</td>"
                        + "<td>"+cli.getTel()+"</td>"
                        + "<td>"+cli.getSexo()+"</td>"
                        + "<td>"+strDate+"</td>"
                        + "<td><a href=form_atualiza.jsp?cpCodigo="+cli.getId()+"> Atualizar </a></td>"
                        + "<td><a href=excluir.jsp?cpCodigo="+cli.getId()+"> Excluir </a></td>\r\n"
                    + "</tr>\r\n");
        }
        sb.append("</table>");
        return sb.toString();
    }
    
    public String getFormAtualizar(Cliente cli){
        StringBuffer sb=new StringBuffer();
        String checkM = "", checkF = "";
        if(cli.getSexo()=='M'){
            checkM="checked='checked'";
        }else if(cli.getSexo()=='F'){
            checkF="checked='checked'";
        }
        String strDate="Null Value";
        if(cli.getDtnasc()!=null){
                strDate = new SimpleDateFormat("dd/MM/yyyy").format(cli.getDtnasc());
            }
        
        sb.append("<form action='atualizar.jsp' name='atualizar' id='atualizar' method='post'>\n");
        sb.append("Codigo do cliente: <input type='text' name='cpCodigo' id='cpCodigo' readonly='true' value='"+cli.getId()+"' /><br/>\r\n"    
                + "\t\tNome: <input type='text' name='cpNome' id='cpNome' value='"+cli.getNome()+"' /><br/>\r\n"
                + "\t\tEmail: <input type='text' name='cpEmail' id='cpEmail' value='"+cli.getEmail()+"' /><br/>\r\n"
                + "\t\tTelefone: <input type='text' name='cpTel' id='cpTel' value='"+cli.getTel()+"' /><br/>\r\n"                
                + "\t\tSexo: <input type='radio' name='cpSexo' id='cpSexoM' "+checkM+" value='M'> Masculino\n"
                + "\t\t      <input type='radio' name='cpSexo' id='cpSexoF' "+checkF+" value='F'> Feminino<br/>\r\n"                
                + "\t\tData de nascimento: <input type='text' name='cpDataNasc' id='cpDataNasc' value='"+strDate+"' />(Formado da data! dd/mm/yyyy)<br/>\r\n"
                + "\t\t<br/>\r\n"
                + "\t\t<input type='submit' value='Salvar alterações'/>\r\n");
        sb.append("\t</form>\r\n");
        return sb.toString();
    }
}