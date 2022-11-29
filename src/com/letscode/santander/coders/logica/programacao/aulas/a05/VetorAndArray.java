package com.letscode.santander.coders.logica.programacao.aulas.a05;

public class VetorAndArray {
    public static void main(String[] args) {
        int[] notas = new int[3];

        notas[0] = 10;
        notas[1] = 7;
        notas[2] = 4;

        int total = 0;
        for (int nota : notas) {
            total += nota;
        }
        int media = total / notas.length;

    }
}
