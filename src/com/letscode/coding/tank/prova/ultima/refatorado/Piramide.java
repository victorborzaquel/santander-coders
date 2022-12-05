package com.letscode.coding.tank.prova.ultima.refatorado;

import java.util.Scanner;

public class Piramide {
public static void main(String[] args) {
        int tamanho = pegarTamanho();
        imprimirPiramide(tamanho);
    }

    public static int pegarTamanho() {
        return new Scanner(System.in).nextInt();
    }

    public static void imprimirPiramide(int tamanho) {
        int hashtag = 1;
        int traco = 1;

        for(int linha = 0; linha < tamanho; linha++) {
            for(int i = tamanho; i > traco; i--) {
                System.out.print("-");
            }
            for(int i = 0; i < hashtag; i++) {
                System.out.print("#");
            }
            for(int i = tamanho; i > traco; i--) {
                System.out.print("-");
            }
            hashtag += 2;
            traco++;
            System.out.println("");
        }

    }
}
