package com.letscode.santander.coders.logica.programacao.listas.l03;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Double resultado = calcular();
        System.out.println("Resultado: "+ resultado);
    }

    private static Double calcular() {
        Double n2;
        int escolha;
        Double resultado = 0d;

        Scanner sc = new Scanner(System.in);
        System.out.print("Primeiro Numero: ");
        Double n1 = sc.nextDouble();
        while (true){
            System.out.print("Operação (menu = 9): ");
            escolha = sc.nextInt();
            switch (escolha) {
                case 0 -> {
                    sc.close();
                    return resultado;
                }
                case 1,2,3,4,5,6,7,8 -> {}
                case 9 -> {
                    imprimirOpcoesDaOperacao();
                    System.out.print("Operação: ");
                    escolha = sc.nextInt();
                }
                default -> {
                    System.out.println("Operação inválida!");
                    continue;
                }
            }
            System.out.printf("%.2f %s ", n1, imprimirOperacao(escolha));
            n2 = sc.nextDouble();

            resultado = fazerOperacao(n1, n2, escolha);
            if (resultado == null) {
                System.out.println("Operação não suportada!");
                continue;
            }
            System.out.printf("%.2f %s %.2f = %f\n", n1, imprimirOperacao(escolha), n2, resultado);

            n1 = resultado;
        }
    }
    private static void imprimirOpcoesDaOperacao() {
        System.out.println("0 - Sair");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Potencia");
        System.out.println("6 - Raiz");
        System.out.println("7 - Seno");
    }
    private static String imprimirOperacao(int escolha) {
        return switch (escolha) {
            case 1 -> "+";
            case 2 -> "-";
            case 3 -> "*";
            case 4 -> "/";
            case 5 -> "^";
            case 6 -> "%";
            case 7 -> "√";
            default -> "";
        };
    }
    private static Double fazerOperacao(Double n1, Double n2, int escolha) {
        if (n1 == null || n2 == null) {
            return null;
        }
        double resultado = 0;
        switch (escolha) {
            case 1 -> resultado = somar(n1, n2);
            case 2 -> resultado = subtrair(n1, n2);
            case 3 -> resultado = multiplicar(n1, n2);
            case 4 -> resultado = dividir(n1, n2);
            case 5 -> resultado = potencia(n1, n2);
            case 6 -> resultado = raiz(n1, n2);
            case 7 -> resultado = logaritmo(n1, n2);
            default -> System.out.println("Opção inválida");
        }
        return resultado;
    }

    private static Double somar(Double n1, Double n2) {
        return n1 + n2;
    }

    private static Double subtrair(Double n1, Double n2) {
        return n1 - n2;
    }

    private static Double dividir(Double n1, Double n2) {
        if (n2 == 0) {
            System.out.println("Não é possível dividir por 0");
            return null;
        }
        return n1 / n2;
    }

    private static Double multiplicar(Double n1, Double n2) {
        return n1 * n2;
    }

    private static Double potencia(Double n1, Double n2) {
        return Math.pow(n1, n2);
    }

    private static Double raiz(Double n1, Double n2) {
        return Math.pow(n1, 1/n2);
    }

    private static Double logaritmo(Double n1, Double n2) {
        return Math.log(n1)/Math.log(n2);
    }
}
