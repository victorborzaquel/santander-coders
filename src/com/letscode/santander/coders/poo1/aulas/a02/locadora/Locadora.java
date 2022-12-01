package com.letscode.santander.coders.poo1.aulas.a02.locadora;

import java.util.ArrayList;
import java.util.List;

public class Locadora {
    private String nome;
    private String cnpj;
    private List<Filme> filmes;

    public Locadora(String nome, String cnpj, List<Filme> filmes) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.filmes = filmes;
    }

    public Locadora(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.filmes = new ArrayList<>();
    }

    public void listarFilmes() {
        for (Filme filme : this.filmes) {
            System.out.println(filme);
        }
    }

    public void cadastrarFilme(Filme filme) {
        this.filmes.add(filme);
    }

    public void removerFilme(Filme filme) {
        this.filmes.remove(filme);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
