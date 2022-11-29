package LogicaProgramacaoI.List.List03;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        printGreetingMessage();

        int number = getNumber();
        long factorial = calculeFactorial(number);

        printSuccessMessage(number, factorial);
    }

    static long calculeFactorial(int number) {
        if (isNotValidRange(number)) {
            return -1;
        }

        if (number == 1) {
            return number;
        }

        return number * calculeFactorial(number - 1);
    }
    static boolean isNotValidRange(int number) {
        return (number < 1) || (number > 20);
    }
    static int getNumber() {

        int number;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Qual número quer descobrir o fatorial? ");
            number = sc.nextInt();

            if(isNotValidRange(number)) {
                printErrorMessage();
            }
        } while (isNotValidRange(number));
        sc.close();

        return number;
    }

    static void printSuccessMessage(long number, long factorial) {
        System.out.println("---------------------------------------");
        System.out.printf("%d! = %d\n", number, factorial);
        System.out.println("---------------------------------------");
    }
    static void printErrorMessage() {
        System.out.println("------------ERROR------------");
        System.out.println("Número não suportado!");
        System.out.println("Digite números entre 1 e 20");
        System.out.println("-----------------------------");
    }

    static void printGreetingMessage() {
        System.out.println("Bem vindo a calculadora de fatorial!");
    }
}
