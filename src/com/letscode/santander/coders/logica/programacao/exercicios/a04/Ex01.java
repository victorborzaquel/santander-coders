package com.letscode.santander.coders.logica.programacao.exercicios.a04;

import java.util.Scanner;

/*
* Victor Borzaquel
* Jackson Veloso
* Raphael Farias
* Fernando Macedo
* */
public class Ex01 {
    public static void main(String[] args) {
        String marca = "Audi";
        boolean ligado = true;
        int velocidadeAtual = 0;
        int escolha;
        final int VELOCIDADE_MAXIMA = 100;
        final int VELOCIDADE_MINIMA = 0;
        Scanner sc = new Scanner(System.in);

        while(ligado) {
            System.out.println("Escolha uma operação:");
            System.out.println("1 - Acelerar");
            System.out.println("2 - Frear");
            System.out.println("3 - Estado atual");
            System.out.println("0 - Desligar");
            System.out.print("Opção: ");

            escolha = sc.nextInt();

            switch (escolha) {
                case 0:
                    if(velocidadeAtual > VELOCIDADE_MINIMA) {
                        System.out.println("Você precisa estar parado para desligar!");
                        break;
                    }

                    ligado = false;
                    System.out.println("O carro foi desligado!");
                    break;
                case 1:
                    if((velocidadeAtual + 10) >= VELOCIDADE_MAXIMA) {
                        velocidadeAtual = 100;
                        System.out.println("Você já está na velocidade máxima!");
                        break;
                    }

                    velocidadeAtual += 10;
                    break;
                case 2:
                    if((velocidadeAtual - 10) <= VELOCIDADE_MINIMA) {
                        velocidadeAtual = 0;
                        System.out.println("Você já está na velocidade minima!");
                        break;
                    }

                    velocidadeAtual -= 10;
                    break;
                case 3:
                    System.out.println("A velocidade atual é de: " + velocidadeAtual);
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
