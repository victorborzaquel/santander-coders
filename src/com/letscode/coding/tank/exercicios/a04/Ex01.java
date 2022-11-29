package com.letscode.coding.tank.exercicios.a04;

public class Ex01 {
	public static void main(String[] args) {

		int k = 35;
		int[] a = { 2, 3, 4, 1, 10, 3, 2 };
		int pos = -1;

		for (int i = 0; i < a.length; i++) {
			if (k == a[i]) {
				pos = i;
			}
		}
		if (pos >= 0) {
			System.out.printf("Achou na posição: %d", pos);
		} else {
			System.out.println("Não achou");
		}
	}
}
