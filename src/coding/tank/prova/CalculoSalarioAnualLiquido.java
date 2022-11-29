package coding.tank.prova;

import java.util.Scanner;

public class CalculoSalarioAnualLiquido {

	private static float salario;

	public static void main(String[] args) {
		setSalario();
		printTabelaSalario();
	}

	public static void setSalario() {
		Scanner sc = new Scanner(System.in);
		
		float novoSalario;
		do {
			System.out.println("Digite o seu salário mensal:");
			novoSalario = sc.nextFloat();

			if (novoSalario < 0) {
				System.out.println("Salário inválido!");
			}
		} while (novoSalario < 0);

		salario = novoSalario;
		sc.close();
	}
	
	public static void printTabelaSalario() {
		float salarioAnualBruto = calcularSalarioAnualBruto();
		float INSSAnual = calcularINSSAnual();
		float salarioAnualLiquido = calcularSalarioAnualLiquido();
		
		System.out.printf("O seu salário anual bruto é: R$ %.2f\n", salarioAnualBruto);
		System.out.printf("Total de INSS anual descontado: R$ %.2f\n", INSSAnual);
		System.out.printf("O seu salário anual líquido é: R$ %.2f\n", salarioAnualLiquido);
	}

	public static float calcularINSS(float valor) {
		float valorINSS;
		
		boolean faixaSalarial1 = valor >= 0 && valor <= 1212;
		boolean faixaSalarial2 = valor > 1212 && valor <= 2427.35;
		boolean faixaSalarial3 = valor > 2427.35 && valor <= 3641.03;
		boolean faixaSalarial4 = valor > 3641.03 && valor <= 7087.22;
		boolean faixaSalarial5 = valor > 7087.22;

		if (faixaSalarial1) {
			valorINSS = valor * 0.075f;
		} else if (faixaSalarial2) {
			valorINSS = valor * 0.09f;
		} else if (faixaSalarial3) {
			valorINSS = valor * 0.12f;
		} else if (faixaSalarial4) {
			valorINSS = valor * 0.14f;
		} else if (faixaSalarial5) {
			valorINSS = 900;
		} else {
			valorINSS = 0;
		}
		
		return valorINSS;
	}
	
	public static float calcularDecimoTerceiro() {
		return salario;
	}
	
	public static float calcularTercoFerias() {
		return salario / 3;
	}
	
	public static float calcularSalarioAnual() {
		return salario * 12;
	}
	
	public static float calcularINSSAnual() {
		float decimoTerceiro = calcularDecimoTerceiro();
		float tercoFerias = calcularTercoFerias();
		float salarioTercoFerias = salario + tercoFerias;
		
		float inssSalario = calcularINSS(salario);
		float inssDecimoTerceiro = calcularINSS(decimoTerceiro);
		float inssSalarioTercoFerias = calcularINSS(salarioTercoFerias);
		
		
		float INSSAnual = (inssSalario * 11) + inssSalarioTercoFerias + inssDecimoTerceiro;
		
		return INSSAnual;
	}

	public static float calcularSalarioAnualBruto() {
		float salarioAnual = calcularSalarioAnual();
		float decimoTerceiro = calcularDecimoTerceiro();
		float tercoFerias = calcularTercoFerias();

		float salarioAnualBruto = salarioAnual + decimoTerceiro + tercoFerias;

		return salarioAnualBruto;
	}

	public static float calcularSalarioAnualLiquido() {
		float salarioAnualBruto = calcularSalarioAnualBruto();
		float INSSAnual = calcularINSSAnual();

		float salarioAnualLiquido = salarioAnualBruto - INSSAnual;

		return salarioAnualLiquido;
	}
}
