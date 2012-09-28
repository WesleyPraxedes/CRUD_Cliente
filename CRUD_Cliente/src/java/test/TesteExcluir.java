package test;

import dao.ClienteDAO;

public class TesteExcluir {
    public static void main(String[] args) throws Exception{
        ClienteDAO dao = new ClienteDAO();
        dao.excluir(8);
        System.out.println("Excluido com Sucesso!");
    }
}