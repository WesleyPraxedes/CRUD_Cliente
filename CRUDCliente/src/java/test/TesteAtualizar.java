package test;

import dao.ClienteDAO;
import java.text.SimpleDateFormat;
import model.Cliente;

public class TesteAtualizar {
    public static void main(String[] args) throws Exception{
        String id = ("6"); // Id do cliente a seratualizado
        String nome = ("Wesley Pro");
        String mail = ("wesley@pro.com");
        String tel = ("6196657468");
        String sx = ("M");
        String dtnasc = ("10/10/2010");

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Cliente c = new Cliente();
        c.setId(Integer.parseInt(id)); //Convertendo String p/ int
        c.setNome(nome);
        c.setTel(Long.parseLong(tel)); // Convertendo String p/ Long
        c.setSexo(sx.charAt(0)); // Capturando o primeito caractere da String
        c.setEmail(mail);
        c.setDtnasc(new java.sql.Date(sdf.parse(dtnasc).getTime())); // Transformando data dd/mm/aaaa p/ aaaa-mm-dd


        ClienteDAO dao = new ClienteDAO();
        dao.atualizar(c);
        System.out.println("Cliente "+c.getNome()+" alterado com sucesso!");
    }
}
