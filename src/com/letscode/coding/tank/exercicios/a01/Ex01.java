package com.letscode.coding.tank.exercicios.a01;

import java.util.Scanner;

class Ex01 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número!");
		double bigger = sc.nextDouble();
		
		for(int i = 0; i < 2; i++) {
			System.out.println("Digite o proximo número!");
			double current = sc.nextDouble();

			if(bigger < current) {
				bigger = current;
			}
		}
		System.out.println("O maior número é: " + bigger);
		sc.close();
	}
}