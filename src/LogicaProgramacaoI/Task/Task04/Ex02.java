package LogicaProgramacaoI.Task.Task04;

import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) {
        int[] numeros = {5, 9, 6, 10, 15, 63, 70};

        System.out.println(Arrays.toString(numeros));

        for (int i = 0, j = numeros.length - 1; i < numeros.length / 2; i++, j--) {
            numeros[i] = numeros[i] + numeros[j];
            numeros[j] = numeros[i] - numeros[j];
            numeros[i] = numeros[i] - numeros[j];
        }

        System.out.println(Arrays.toString(numeros));
    }
}
