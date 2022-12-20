package com.letscode.santander.coders.poo1.provas.exercicio01.ex02;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora(10, 5);

        System.out.println(calc);

        calc.setValor1(20);
        calc.setValor2(10);
        System.out.println("Soma: " + calc.soma());
        System.out.println("Subtração: " + calc.subtracao());
        System.out.println("Multiplicação: " + calc.multiplicacao());
        System.out.println("Divisão: " + calc.divisao());
    }
}
