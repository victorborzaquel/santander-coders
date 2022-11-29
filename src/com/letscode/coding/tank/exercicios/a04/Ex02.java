package com.letscode.coding.tank.exercicios.a04;

import java.util.Scanner;

public class Ex02 {
	
	private static final int MAX = 100;
	private static int[] numeros = new int[MAX];
	private static int[] numerosInvertidos;
	private static int quantNumeros = 0;
	
	public static void main(String[] args) {
		setNumeros();
		invertNumeros();
		printNumeros();
	}
	
	public static void setNumeros() {
		Scanner sc = new Scanner(System.in);
		
		int numeroAtual;
		do {
			System.out.println("Digite um número ou 0 para fechar:");
			numeroAtual = sc.nextInt();
			if (numeroAtual == 0) {
				break;
			}
			numeros[quantNumeros] = numeroAtual;
			quantNumeros++;
		} while (quantNumeros < MAX);
		sc.close();
	}

	public static void invertNumeros() {
		numerosInvertidos = new int[quantNumeros];
		
		for (int i = 0; i < quantNumeros; i++) {
			numerosInvertidos[i] = numeros[quantNumeros - i - 1];
		}
	}
	
	public static void printNumeros() {
		String printNumeros = "";
		String printNumerosInvertidos = "";
		
		for (int i = 0; i < quantNumeros; i++) {
			printNumeros += numeros[i] + " ";
			printNumerosInvertidos += numerosInvertidos[i] + " ";
		}
		
		System.out.println(printNumeros);
		System.out.println(printNumerosInvertidos);
	}
}
