package LogicaProgramacaoI.List.List01;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        double peso = sc.nextDouble();
        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();

        sc.close();

        double imc = peso / Math.pow(altura, 2);
        System.out.printf("\nO seu IMC é: %.2f\n\n", imc);

        System.out.println("A tabela de IMC é:");
        System.out.println("Menor que 18.5 - Abaixo do peso");
        System.out.println("Entre 18.5 e 24.9 - Peso normal");
        System.out.println("Entre 25.0 e 29.9 - Pré-obesidade");
        System.out.println("Entre 30.0 e 34.9 - Obesidade Grau 1");
        System.out.println("Entre 35.0 e 39.9 - Obesidade Grau 2");
        System.out.println("Acima de 40 - Obesidade Grau 3");
    }
}
