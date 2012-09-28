package facade;

import dao.ClienteDAO;
import java.text.SimpleDateFormat;
import javax.servlet.http.HttpServletRequest;
import model.Cliente;

/**
 *
 * @author Wesley
 */
public class FormFacade extends BaseFacade{
    //  LISTAR CLIENTES  ///////////////////////////////////////////////////////
    public String getListClientes(){
        try{
            ClienteDAO dao = new ClienteDAO();
            return html.getList(dao.listar());
        } catch (Exception ex) {
            return "Exceção: " + ex.getMessage();
        }
    }    
    // SALVAR NOVO CLIENTE  ////////////////////////////////////////////////////
    public String salvarCliente (HttpServletRequest req){
        try{
            // Recuperando os valores passados como parametros pelo formulário            
            String noCliente = req.getParameter("cpNome");
            String emCliente = req.getParameter("cpEmail");
            String tlCliente = req.getParameter("cpTel");
            String sxCliente = req.getParameter("cpSexo");
            String dnCliente = req.getParameter("cpDataNasc");
            
            System.out.println(noCliente+" "+ emCliente+" "+ tlCliente+" "+ sxCliente+dnCliente);//Exibi dados no console para converri funcionamento. 

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            
            // Montado objeto CandidatoVO
            Cliente c = new Cliente();
            c.setNome(noCliente);
            c.setEmail(emCliente);
            c.setTel(Long.parseLong(tlCliente));
            c.setSexo(sxCliente.charAt(0));
            c.setDtnasc(new java.sql.Date(sdf.parse(dnCliente).getTime()));
            
            // Persistindo dados atravez do ClienteDAO
            ClienteDAO dao = new ClienteDAO();
            dao.cadastar(c);
            
            System.out.println("Gravado!");//Confirmar salvamento no console.
            
            return "Candidato cadastrado com sucesso";
            
        }catch (Exception ex){
            return "Exceção: "+ex.getMessage();
        }
    }
    
    // PESQUISA POR ID  ////////////////////////////////////////////////////////
    public String getPreencherForm(HttpServletRequest req) {
        try {
            
            String idCliente = req.getParameter("cpCodigo");
            System.out.println("Ate aqui ok | --------- > "+idCliente);
            
            ClienteDAO dao = new ClienteDAO();
            return html.getFormAtualizar(dao.buscaporId(Integer.parseInt(idCliente)));
        } catch (Exception ex) {
            return "Exceção: " + ex.getMessage();
        }
    }
    // ATUALIZAR CLIENTE  //////////////////////////////////////////////////////
    public String atualizarCliente (HttpServletRequest req){
        try{
            // Recuperando os valores passados como parametros pelo formulário.            
            String idCliente = req.getParameter("cpCodigo");
            String noCliente = req.getParameter("cpNome");
            String emCliente = req.getParameter("cpEmail");
            String tlCliente = req.getParameter("cpTel");
            String sxCliente = req.getParameter("cpSexo");
            String dnCliente = req.getParameter("cpDataNasc");
            
            System.out.println(idCliente+" "+noCliente+" "+ emCliente+" "+ tlCliente+" "+ sxCliente+" "+dnCliente);//Testa se os valores estão corretos.

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            
            // Montado objeto CandidatoVO
            Cliente c = new Cliente();
            c.setId(Integer.parseInt(idCliente));
            c.setNome(noCliente);
            c.setEmail(emCliente);
            c.setTel(Long.parseLong(tlCliente));
            c.setSexo(sxCliente.charAt(0));
            c.setDtnasc(new java.sql.Date(sdf.parse(dnCliente).getTime()));
            
            // Persistindo dados no MySQL
            ClienteDAO dao = new ClienteDAO();
            dao.atualizar(c);
            
            System.out.println("Atualizado!");
            
            return "Cliente atualizado com sucesso";
            
        }catch (Exception ex){
            return "Exceção: "+ex.getMessage();
        }
    }
    // EXCLUIR CLIENTE  ////////////////////////////////////////////////////////
    public String excluirCliente(HttpServletRequest request){
        try {
            String idCliente = request.getParameter("cpCodigo");
            
            ClienteDAO dao = new ClienteDAO();
            dao.excluir(Integer.parseInt(idCliente));            
            
            return "Cliente excluido com sucesso!";
        } catch (Exception ex) {
            return "Exceção: " + ex.getMessage();
        }
    }
}