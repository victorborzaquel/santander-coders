package com.letscode.santander.coders.poo1.aulas.a01.pessoa;

import com.letscode.santander.coders.poo1.aulas.a01.dados.pessoais.Endereco;

public class Pessoa {
    private String nome;
    private String email;
    private Endereco endereco;

    public Pessoa(String nome, String email, Endereco endereco) {

    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
