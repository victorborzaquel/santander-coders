package coding.tank.prova.ultima;

import java.util.Random;
import java.util.Scanner;

public class Prova3 {
	public static void main(String[] args) {
////        int[][] matriz = montarEPreencherQuadrado(); 
//		int[][] matriz = {{1,1,1},{1,1,1},{1,1,1}};
//        int somaLinha = linhaPerfeita(matriz);
////        int somaDiagonalPrincipal = diagonalPrincipalPerfeita(matriz);
////        int somaDiagonalSecundaria = diagonalSecundariaPerfeita(matriz);
//        int somaColuna = colunaPerfeita(matriz);
// 
//        if(somaLinha == somaDiagonalPrincipal && somaDiagonalSecundaria == somaColuna && somaColuna == somaLinha) {
//        	System.out.println("É um quadrado perfeito");
//        } else {
//        	System.out.println("Desculpa, essa matriz não é um quadrado perfeito");
//        }
//    }
//	
//	public static int colunaPerfeita(int[][] matriz) {
//		int[] colunas = new int[matriz.length];
//		
//		for(int linha = 0; linha < matriz.length; linha++) {
//			for(int coluna = 0; coluna < matriz.length; coluna++) {
//				colunas[coluna] += matriz[linha][coluna];
//			}
//		}
//		int linhaComparacao = colunas[0];
//		for(int i = 1; i < colunas.length; i++) {
//			if(linhaComparacao != colunas[i]) {
//				return -1;
//			}
//		}
//		return linhaComparacao;
//	}
//	
//	
//	public static int linhaPerfeita(int[][] matriz) {
//		int[] linhas = new int[matriz.length];
//		
//		for(int linha = 0; linha < matriz.length; linha++) {
//			int linhaAtual = 0;
//			
//			for(int coluna = 0; coluna < matriz.length; coluna++) {
//				linhaAtual += matriz[linha][coluna];
//			}
//			
//			linhas[linha] = linhaAtual;
//		}
//		int linhaComparacao = linhas[0];
//		for(int i = 1; i < linhas.length; i++) {
//			if(linhaComparacao != linhas[i]) {
//				return -1;
//			}
//		}
//		return linhaComparacao;
//	}
//
//	public static int diagonalPerfeita(int[][] matriz) {
//		int diagonalPrincipal = 0;
//		int diagonalSecundaria = 0;
//		int[] colunas = new int[matriz.length];
//		
//		for(int linha = 0; linha < matriz.length; linha++) {
//			for(int coluna = 0; coluna < matriz.length; coluna++) {
//				colunas[coluna] += matriz[linha][coluna];
//				
//				if(linha == coluna) {
//					diagonalPrincipal += matriz[linha][coluna];
//				}
//				
//				if(matriz.length - linha - 1 == coluna) {
//					diagonalSecundaria += matriz[linha][coluna];
//				}
//			}
//		}
//		return diagonalPrincipal;
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
                int valorAleatorio = random.nextInt(0, 1000);
                colunas[coluna] = valorAleatorio;
                System.out.print("[" + valorAleatorio + "]");
            }
            System.out.println();
        }
        return matriz;
    }
}
