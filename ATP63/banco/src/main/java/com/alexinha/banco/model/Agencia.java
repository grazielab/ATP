package com.alexinha.banco.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "agencia")

public class Agencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String banco;
    private int agencia;
    private String localizacao;

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setBanco(String banco) {
        this.banco = banco;
    }
    public String getBanco() {
        return banco;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public int getAgencia() {
        return agencia;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    public String getLocalizacao() {
        return localizacao;
    }

}
