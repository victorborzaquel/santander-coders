package com.letscode.santander.coders.poo1.exercicios.a01.geometria;

import com.letscode.santander.coders.poo1.exercicios.a01.geometria.abstracts.Figura;

public class Retangulo extends Figura {
    private double lado1;
    private double lado2;

    public Retangulo(String cor, double lado1, double lado2) {
        super(cor);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double area() {
        return lado1 * lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    @Override
    public String toString() {
        return String.format("Retangulo [lado1=%s, lado2=%s, cor=%s]", lado1, lado2, getCor());
    }
}
