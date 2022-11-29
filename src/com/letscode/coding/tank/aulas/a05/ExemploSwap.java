package com.letscode.coding.tank.aulas.a05;

public class ExemploSwap {
	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		
		a = a + b;
		b = a - b;
		a = a - b;

		a+=b;
		b=a-b;
		a-=b;

		a+=b;
		b*=-1;
		b+=a;
		a-=b;
	}
}
