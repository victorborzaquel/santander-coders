package com.letscode.coding.tank.prova.ultima.refatorado;

import java.util.Random;
import java.util.Scanner;

public class Q02 {
	public static void main(String[] args) {
        int[][] matriz = montarEPreencherQuadrado(); 
//        int[][] matriz = {{20,6,7,17},{9,15,14,12},{13,11,10,16},{8,18,19,5}}; 

        int[][] somaMatriz = somaMatriz(matriz);
        boolean quadradoPerfeito = verificaSeQuadradoPerfeito(somaMatriz);
        imprimeSePerfeito(quadradoPerfeito);
    }

	public static void imprimeSePerfeito(boolean quadradoPerfeito) {
		if(quadradoPerfeito) {
			System.out.println("Essa matriz é um quadrado perfeito.");
		} else {
			System.out.println("Desculpe, essa matriz não é um quadrado perfeito.");
		}
	}
	
	public static boolean verificaSeQuadradoPerfeito(int[][] matriz) {
		for(int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna < matriz.length; coluna++) {
				if(matriz[0][0] != matriz[linha][coluna]) {
					return false;
				}
			}
		}
		return true;
	}

	public static int[][] somaMatriz(int[][] matriz) {
		int[][] somatoriaMatriz = new int[2][matriz.length + 1];

		for(int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna < matriz.length; coluna++) {
				if(linha == coluna) {
					somatoriaMatriz[0][matriz.length] += matriz[linha][coluna];
				}
				if(matriz.length - linha - 1 == coluna) {
					somatoriaMatriz[1][matriz.length] += matriz[linha][coluna];
				}
				somatoriaMatriz[0][linha] += matriz[linha][coluna];
				somatoriaMatriz[1][coluna] += matriz[linha][coluna];
			}
		}
		return somatoriaMatriz;
	}
	
	public static int[][] montarEPreencherQuadrado() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o tamanho do quadrado desejado:");
        int tamanho = scanner.nextInt();
        scanner.close();
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
