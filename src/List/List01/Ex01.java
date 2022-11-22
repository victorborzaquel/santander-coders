package List.List01;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite sua Profissão: ");
        String profissao = sc.nextLine();

        sc.close();

        System.out.print("Seu nome é: " + nome + "\n");
        System.out.println("Sua idade é: " + idade);
        System.out.printf("Sua Profissão é: %s\n", profissao);
    }
}
