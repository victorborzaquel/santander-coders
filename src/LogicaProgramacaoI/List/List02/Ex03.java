package LogicaProgramacaoI.List.List02;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        int quantityGrades;
        double sum = 0, average;
        Scanner sc;

        System.out.println("Bem vindo a calculadora de média!");
        System.out.print("Quantidade de notas: ");
        sc = new Scanner(System.in);
        quantityGrades = sc.nextInt();

        if(quantityGrades <= 0) {
            System.out.println("Informe uma quantidade válida!");
            return;
        }

        for (int i = 1; i <= quantityGrades; i++) {
            System.out.printf("Digite a %dª nota: ", i);
            sum += sc.nextDouble();
        }
        sc.close();

        average = sum / quantityGrades;
        System.out.printf("A sua média é: %.2f", average);
    }

}
