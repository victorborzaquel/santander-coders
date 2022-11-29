package com.letscode.santander.coders.logica.programacao.exercicios.a03;

import java.util.Scanner;

public class Balada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean podeEntrar = false;

        System.out.print("Qual a sua idade? ");
        int respostaIdade = sc.nextInt();

        if(respostaIdade >= 18) {
            podeEntrar = true;
        } else if (respostaIdade >= 16){
            System.out.print("está acompanhado? ");
            boolean estaAcompanhado = sc.nextBoolean();

            if(estaAcompanhado) {
                podeEntrar = true;
            }
        }
        sc.close();

        if(podeEntrar) {
            System.out.println("Pode entrar!");
        } else {
            System.out.println("Não pode entrar!");
        }
    }
}
