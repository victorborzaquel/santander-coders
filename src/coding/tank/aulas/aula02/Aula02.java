package coding.tank.aulas.aula02;

import java.util.Scanner;

public class Aula02 {
	public static void main(String[] args) {
//		aumentaSalario();
//		calculaSalario();
//		calcularINSS();
		calcularTercoFerias();
		
		Aula02 aula02 = new Aula02();
		aula02.instanciavel();
	}
	
	public void instanciavel() {
		
	}
	
	public static void calculaSalario() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu salário anual:");
		float salario = sc.nextFloat();
		
		float mediaAnual = (salario * 13) / 12;
		System.out.printf("A sua mádia salarial é: %.2f", mediaAnual);
		sc.close();
	}
	
	public static void aumentaSalario() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu salário:");
		float salario = sc.nextFloat();
		int codigo = 0;
		
		do {
			System.out.println("Digite o código do cargo:");
			System.out.println("1 = Técnico");
			System.out.println("2 = Gerente");
			System.out.println("3 = Demais");
			codigo = sc.nextInt();
			
			if(codigo == 1) {
				salario *= 1.5f;
			} else if(codigo == 2) {
				salario *= 1.3f;
			} else if(codigo == 3) {
				salario *= 1.2f;
			} else {
				System.out.println("Opção inválida");
			}
		} while(codigo < 1 || codigo > 3);
		
		System.out.println("Seu salário reajustado é: " + salario);
		sc.close();
	}
	
	public static void calcularINSS() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o salário:");
		
		float salario = sc.nextFloat();
		float aliquotaINSS = 0.075f;
		float inss = salario * aliquotaINSS;
		
		System.out.println("O valor do INSS é: " + inss);
		sc.close();
	}
	
	public static void calcularTercoFerias() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o salário:");
		
		float salario = sc.nextFloat();
		float percentual = 0.33f;
		float tercoFerias = salario * percentual;
		
		System.out.printf("O valor do terço férias é: R$ %.2f", tercoFerias);
		sc.close();
	}
}
