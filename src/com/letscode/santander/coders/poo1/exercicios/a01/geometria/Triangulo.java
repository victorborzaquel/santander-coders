package com.letscode.santander.coders.poo1.exercicios.a01.geometria;

import com.letscode.santander.coders.poo1.exercicios.a01.geometria.abstracts.Figura;

public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(String cor, double base, double altura) {
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    public double area() {
        return base * altura / 2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return String.format("Triangulo [base=%s, altura=%s, cor=%s]", base, altura, getCor());
    }
}
