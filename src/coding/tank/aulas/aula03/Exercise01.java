package coding.tank.aulas.aula03;

import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a coordenada X");
		float x = sc.nextFloat();
		System.out.println("Informe a coordenada Y");
		float y = sc.nextFloat();
		
		if (x > 0 && y > 0) {
			System.out.println("Está no quadrante B");
		} else if (x > 0 && y < 0) {
			System.out.println("Está no quadrante C");
		} else if (x < 0 && y > 0) {
			System.out.println("Está no quadrante A");
		} else if (x < 0 && y < 0) {
			System.out.println("Está no quadrante D");
		} else {
			System.out.println("Está sobre 1 dos eixos");
		}

		sc.close();
	}
}
