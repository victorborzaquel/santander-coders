package com.letscode.coding.tank.prova.ultima.refatorado;

import java.util.Random;
import java.util.Scanner;

public class QuadradoPerfeito {

    public static void main(String[] args) {
        int[][] matriz = montarEPreencherQuadrado();
//        int[][] matriz = {{20,6,7,17},{9,15,14,12},{13,11,10,16},{8,18,19,5}};
        boolean isQuadradoPerfeito = verificarQuadradoPerfeito(matriz);
        imprimeResultado(isQuadradoPerfeito);
    }

    private static void imprimeResultado(boolean isQuadradoPerfeito) {
        if (isQuadradoPerfeito) {
            System.out.println("É um quadrado perfeito!");
        } else {
            System.out.println("Não é um quadrado perfeito!");
        }
    }

    private static boolean verificarQuadradoPerfeito(int[][] matriz) {
        int tamanho = matriz.length;
        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;
        int[] somaLinha = new int[tamanho];
        int[] somaColuna = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            somaDiagonalPrincipal += matriz[i][i];
            somaDiagonalSecundaria += matriz[i][tamanho - i - 1];
            for (int j = 0; j < tamanho; j++) {
                somaLinha[i] += matriz[i][j];
                somaColuna[i] += matriz[j][i];
            }
        }

        int somaBase = somaColuna[0];
        if (somaDiagonalSecundaria != somaDiagonalPrincipal || somaBase != somaDiagonalPrincipal) {
            return false;
        }

        for (int i = 0; i < tamanho; i++) {
            if (somaBase != somaLinha[i] || somaBase != somaColuna[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[][] montarEPreencherQuadrado() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o tamanho do quadrado desejado:");
        int tamanho = scanner.nextInt();
        int[][] matriz = new int[tamanho][tamanho];
        for (int linha = 0; linha < matriz.length; linha++) {
            int[] colunas = matriz[linha];
            for (int coluna = 0; coluna < colunas.length; coluna++) {
                int valorAleatorio = random.nextInt(1000);
                colunas[coluna] = valorAleatorio;
                System.out.print("[" + valorAleatorio + "]");
            }
            System.out.println();
        }
        return matriz;
    }

}