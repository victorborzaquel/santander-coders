package com.letscode.santander.coders.poo1.exercicios.a01;

import com.letscode.santander.coders.poo1.exercicios.a01.geometria.Circulo;
import com.letscode.santander.coders.poo1.exercicios.a01.geometria.Quadrado;
import com.letscode.santander.coders.poo1.exercicios.a01.geometria.Retangulo;
import com.letscode.santander.coders.poo1.exercicios.a01.geometria.Triangulo;
import com.letscode.santander.coders.poo1.exercicios.a01.geometria.abstracts.Figura;

public class Main {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[4];

        figuras[0] = new Triangulo("vermelho", 10, 20);
        figuras[1] = new Retangulo("azul", 10, 20);
        figuras[2] = new Quadrado("verde", 10);
        figuras[3] = new Circulo("amarelo", 10);

        for (Figura figura : figuras) {
            System.out.println(figura);
        }
    }
}
