package List.List02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc;
        double n1, n2;
        int operation;
        boolean invalidOperation;

        System.out.println("Digite o número da operação que vai fazer!");
        System.out.println("1: Somar");
        System.out.println("2: Subtrair");
        System.out.println("3: Dividir");
        System.out.println("4: Multiplicar");
        System.out.println("5: Resto");
        System.out.println("6: Raiz");
        System.out.println("7: Potência");

        sc = new Scanner(System.in);
        operation = sc.nextInt();
        
        invalidOperation = (1 > operation) || (operation > 7);
        if(invalidOperation) {
            System.out.println("Número da operação inválido!");
            return;
        }
        System.out.print("Digite o primeiro número: ");
        n1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        n2 = sc.nextDouble();
        sc.close();

        switch (operation) {
            case 1: // Somar
                System.out.printf("O resultado da adição é: %f\n", (n1 + n2));
                break;
            case 2: // Subtrair
                System.out.printf("O resultado da subtração é: %f\n", (n1 - n2));
                break;
            case 3: // Dividir
                if(n2 == 0) {
                    System.out.println("Não é possível dividir por 0!");
                    return;
                }
                System.out.printf("O resultado da divisão é: %f\n", (n1 / n2));
                break;
            case 4: // Multiplicar
                System.out.printf("O resultado da multiplicação é: %f\n", (n1 * n2));
                break;
            case 5: // Resto
                System.out.printf("O resto da divisão é: %f\n", (n1 % n2));
                break;
            case 6: // Raiz
                System.out.printf("A raiz é: %f\n", Math.pow(n1, 1/n2));
                break;
            case 7: // Potência
                System.out.printf("A potência é: %f\n", Math.pow(n1, n2));
                break;
        }
    }
}
