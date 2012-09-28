package test;

import dao.ClienteDAO;
import model.Cliente;

/**
 *
 * @author Wesley
 */
public class TesteCadastrar {
    public static void main(String[] args) throws Exception{
        Cliente c = new Cliente();
        c.setNome("Wesley Praxedes");
        c.setEmail("wesleyprofile@gmail.com");
        c.setTel(98764321);
        c.setSexo('M');
        c.setDtnasc(new java.sql.Date(System.currentTimeMillis()));  //Pega data atual.
        
        ClienteDAO dao = new ClienteDAO();
        dao.cadastar(c);
        System.out.println("Cliente "+c.getNome()+" cadrastrado com sucesso!");
    }    
}