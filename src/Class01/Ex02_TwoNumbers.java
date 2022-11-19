package Class01;

import java.util.Scanner;

public class Ex02_TwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o Primeiro Número: ");
        double number1 = sc.nextInt();
        System.out.print("Digite o Segundo Número: ");
        double number2 = sc.nextInt();
        sc.close();

        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        System.out.printf("\nVocê digitou os números: %.2f e %.2f\n", number1, number2);
        System.out.printf("A soma é: %.2f\n", addition);
        System.out.printf("A subtração é: %.2f\n", subtraction);
        System.out.printf("A multiplicação é: %.2f\n", multiplication);
        System.out.printf("A divisão é: %.2f\n", division);
    }
}
