package com.letscode.santander.coders.logica.programacao.tarefas.t03;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7};

        int search = getSearchNumber();
        boolean isFoundNumber = haveInArray(numbers, search);

        printSearchResult(isFoundNumber);
    }
    static boolean haveInArray(int[] numbers, int search) {
        for (int number : numbers) {
            if(number == search) {
                return true;
            }
        }
        return false;
    }
    static int getSearchNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual número quer pesquisar no array? ");
        int search = sc.nextInt();
        sc.close();

        return search;
    }
    static void printSearchResult(boolean isFoundNumber) {
        if(isFoundNumber) {
            System.out.println("O número %d foi encontrado no array!");
        } else {
            System.out.println("Lamento, o número %d não foi encontrado no array!");
        }
    }
}
