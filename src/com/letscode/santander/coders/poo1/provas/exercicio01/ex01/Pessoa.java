package com.letscode.santander.coders.poo1.provas.exercicio01.ex01;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome) {
        this.nome = nome;
    }
    public Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public Pessoa(String nome, Integer idade, Double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return String.format("nome: %s\nidade: %d\naltura: %.2f", nome, idade, altura);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
}
