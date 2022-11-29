package com.letscode.coding.tank.aulas.a04;

import java.util.Scanner;

public class Main {
	
	static int i;
	static double d;
	static String s;
	static boolean b;
	static char c;
	
	public static void main(String[] args) {
//		inicializacao();
//		array();
	}
	
	public static void inicializacao() {
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(s);
		System.out.println(b);
		System.out.println(c);
	}
	
	public static void array() {
		Scanner sc = new Scanner(System.in);
		int quantAlunos = 3;
		
		float[] notas = new float[quantAlunos];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a %d nota: ", i + 1);	
			notas[i] = sc.nextFloat();
		}
		
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("A %d nota é: %.1f%n", i + 1, notas[i]);	
		}
		sc.close();
	}
}
