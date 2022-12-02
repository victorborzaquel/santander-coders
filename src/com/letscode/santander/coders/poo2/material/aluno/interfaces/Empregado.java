package com.letscode.santander.coders.poo2.material.aluno.interfaces;

import java.math.BigDecimal;

public class Empregado implements Comparable {
    private final int matricula;
    private final String nome;
    private final BigDecimal salario;

    public Empregado(int matricula, String nome, Double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = new BigDecimal(salario.toString());
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return Integer.compare(matricula, ((Empregado) o).matricula);
    }
}
