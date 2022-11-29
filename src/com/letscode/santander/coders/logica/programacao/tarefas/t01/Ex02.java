package com.letscode.santander.coders.logica.programacao.tarefas.t01;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite seu salario: ");
        double salario = sc.nextDouble();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();
        sc.nextLine();

        System.out.print("Digite seu sexo: ");
        String sexo = sc.nextLine();

        sc.close();

        System.out.printf("Seu nome é: %s\n", nome);
        System.out.printf("Seu salario é: R$ %.2f\n", salario);
        System.out.printf("Sua Idade é: %d\n", idade);
        System.out.printf("Sua altura é: %.2f\n", altura);
        System.out.printf("Seu sexo é: %s\n", sexo);
    }
}
