package test;

import dao.ClienteDAO;
import java.util.List;
import model.Cliente;

/**
 *
 * @author Wesley
 */
public class TesteListar {
    public static void main(String[] args) throws Exception{
        ClienteDAO dao = new ClienteDAO();

        List<Cliente> clientes = dao.listar();

        for(Cliente cliente : clientes){
            System.out.println("Cod: " + cliente.getId());
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Telefone: " + cliente.getTel());
            System.out.println("Email: " + cliente.getEmail());
            System.out.println("Sexo: " + cliente.getSexo());
            System.out.println("DN: " + cliente.getDtnasc());
            System.out.println("");
        }
        System.out.print("Fim!");
    }
}
