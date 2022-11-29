package com.letscode.coding.tank.prova.ultima.questoes;

import java.util.Scanner;

public class Q01 {
	public static void main(String[] args) {
	    int tamanho = pegarTamanho();
	    imprimirPiramide(tamanho);
	}
	
	public static int pegarTamanho() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o tamanho da pirâmide: ");
		int tamanho = sc.nextInt();
		sc.close();
		return tamanho;
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
