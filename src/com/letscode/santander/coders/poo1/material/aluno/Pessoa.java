package com.letscode.santander.coders.poo1.material.aluno;

public class Pessoa {
    String nome;
    String sobrenome;

    Pessoa() {}

    Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String obterNomeCompleto() {
        return nome + sobrenome;
    }

    public void teste() {
        String nomeCompleto = obterNomeCompleto();
    }
}
