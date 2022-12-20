package com.letscode.santander.coders.poo1.exercicios.a01.geometria;

import com.letscode.santander.coders.poo1.exercicios.a01.geometria.abstracts.Figura;

public class Circulo extends Figura {
    private double raio;

    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }

    public double area() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getDiametro() {
        return raio * 2;
    }

    @Override
    public String toString() {
        return String.format("Circulo [raio=%s, cor=%s]", raio, getCor());
    }
}
