package coding.tank.aulas.aula04;

import java.util.Scanner;

public class Exercise03 {

	private static int dimensao;
	private static int matriz[][];

	public static void main(String[] args) {
		setDimensao();
		printMatriz();
	}

	public static void setDimensao() {
		Scanner sc = new Scanner(System.in);
		final int MAXLENGHT = 20;
		int entrada;

		do {
			System.out.printf("Digito a dimenção da matriz: ");
			entrada = sc.nextInt();

			if (entrada > MAXLENGHT) {
				System.out.println("Erro, digite uma dimensão menor que 20!");
			}
		} while (entrada > MAXLENGHT);

		sc.close();
		dimensao = entrada;
		matriz = new int[entrada][entrada];
	}
	
	public static void setMatriz() {
		for (int coluna = 0; coluna < dimensao; coluna++) {
			for (int linha = 0; linha < dimensao; linha++) {
				matriz[coluna][linha] = (coluna > linha) ? 1 : 0;
			}
		}
	}

	public static void printMatriz() {
		String matrizString = "";
		for (int coluna = 0; coluna < dimensao; coluna++) {
			for (int linha = 0; linha < dimensao; linha++) {
				matrizString += (coluna > linha) ? "1 " : "0 ";
			}
			matrizString += "\n";
		}
		System.out.println(matrizString);
	}
}
