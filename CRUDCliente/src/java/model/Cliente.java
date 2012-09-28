package model;

import java.sql.Date;

public class Cliente {
    private int  id;
    private String nome;
    private String email;
    private long tel;
    private char sexo;
    private Date dtnasc;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getTel() {
        return tel;
    }
    public void setTel(long tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Date getDtnasc() {
        return dtnasc;
    }
    public void setDtnasc(Date dtnasc) {
        this.dtnasc = dtnasc;
    }
}