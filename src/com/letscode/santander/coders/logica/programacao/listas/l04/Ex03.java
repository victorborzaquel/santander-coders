package com.letscode.santander.coders.logica.programacao.listas.l04;

/*
(leetcode) Dado um array nums. Definimos uma soma acumulada de um array como
nums[i] = soma(nums[0]…nums[i]), ou seja, cada elemento deve ser a soma de todos
os elementos anteriores e o atual. Por fim, retorne a array com as somas.

Exemplo 01:
nums = [1,2,3,4]

Output: [1,3,6,10]
*/
public class Ex03 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] somaAcumulada = calculaSomaAcumulada(nums);
        printArray(somaAcumulada);
    }

    public static int[] calculaSomaAcumulada(int[] nums) {
        int[] somaAcumulada = new int[nums.length];
        somaAcumulada[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            somaAcumulada[i] = nums[i] + somaAcumulada[i-1];
        }
        return somaAcumulada;
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length - 1] + "]");
    }
}
