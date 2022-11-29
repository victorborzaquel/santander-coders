package coding.tank.aulas.aula01;

import java.util.Arrays;
import java.util.Scanner;

class exercise02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int amount = 2;
		double numbers[] = new double[amount];
		
		for(int i = 0; i < amount; i++) {
			System.out.println("Entre com proximo número:");
			numbers[i] = sc.nextDouble();
		}
		
		Arrays.sort(numbers);
		
		System.out.println("Os números ordenados são:");
		for(double current : numbers) {
			System.out.println(current);
		}
		sc.close();
	}
}
