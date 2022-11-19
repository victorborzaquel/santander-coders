package Class03;

import java.util.Scanner;

public class TarefaCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String operacao;
        double n1, n2;

        System.out.print("Qual operação: ");
        operacao = sc.nextLine();
        System.out.print("Numero 1: ");
        n1 = sc.nextDouble();
        System.out.print("Numero 2: ");
        n2 = sc.nextDouble();

        switch (operacao) {
            case "soma":
                System.out.println(n1 + n2);
                break;
            case "subtracao":
                System.out.println(n1 - n2);
                break;
            case "multiplicacao":
                System.out.println(n1 * n2);
                break;
            case "divisao":
                System.out.println(n1 / n2);
                break;
            default:
                System.out.println("Valor invalido");
                break;
        }
    }
}
