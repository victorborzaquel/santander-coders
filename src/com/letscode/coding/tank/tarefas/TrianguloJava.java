package com.letscode.coding.tank.tarefas;

import java.util.Scanner;

public class TrianguloJava {
	
	private static int quantidade;
	
	public static void main(String[] args) {
		setQuantidade();
		printTriangulo();
	}
	
	public static void setQuantidade() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de linhas:");
		quantidade = sc.nextInt();
		sc.close();
	}
	
	public static void printTriangulo() {
		for(int i = quantidade; i > 0; i--) {
			System.out.println("*".repeat(i));
		}
	}
}
