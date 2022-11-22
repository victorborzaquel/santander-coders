package List.List02;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        System.out.print("Digite o número para descobrir o fatorial: ");
        Scanner sc = new Scanner(System.in);
        int numberInput = sc.nextInt();
        sc.close();

        int result = numberInput;
        for(int i = numberInput - 1; i > 0; i--) {
            result *= i;
        }
        System.out.printf("O fatorial de %d é: %d", numberInput, result);
    }
}
