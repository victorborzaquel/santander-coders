package com.letscode.santander.coders.logica.programacao.tarefas.t02;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        int[] array = {1,45,2,5,78,23,657,0,64,234,8967};
        int search = getSearch();
        int index = searchInArray(array, search);

        printSearchResult(index, search);
    }
    public static void printSearchResult(int index, int search) {
        if(index == -1) {
            System.out.println("--------------------------------");
            System.out.printf("Não existe o número %d no vetor!\n", search);
            System.out.println("--------------------------------");
            return;
        }

        System.out.println("----------------------------------------------");
        System.out.printf("O número %d foi encontrado na posição %d do vetor!\n", search, index);
        System.out.println("----------------------------------------------");
    }
    public static int getSearch() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo a pesquisa do array!");
        System.out.print("Qual número gostaria de pesquisar? ");
        int search = sc.nextInt();
        sc.close();

        return search;
    }
    public static int searchInArray(int[] array, int search) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == search) {
                return i;
            }
        }
        return -1;
    }
}
