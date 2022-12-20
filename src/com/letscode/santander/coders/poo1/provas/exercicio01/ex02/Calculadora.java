package com.letscode.santander.coders.poo1.provas.exercicio01.ex02;

public class Calculadora {
    private double valor1;
    private double valor2;

    public Calculadora() {}
    public Calculadora(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public double soma() {
        return valor1 + valor2;
    }

    public double subtracao() {
        return valor1 - valor2;
    }

    public double multiplicacao() {
        return valor1 * valor2;
    }

    public double divisao() {
        return valor1 / valor2;
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    @Override
    public String toString() {
        return "-----Calculadora-----" + "\n" +
                "Valor 1: " + valor1 + "\n" +
                "Valor 2: " + valor2 + "\n" +
                "Soma: " + soma() + "\n" +
                "Subtração: " + subtracao() + "\n" +
                "Multiplicação: " + multiplicacao() + "\n" +
                "Divisão: " + divisao() + "\n" +
                "----------------------";
    }
}
